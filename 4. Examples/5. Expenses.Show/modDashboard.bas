﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "dashboardcode"
	Public expcont As VMContainer   ' container for Add Expense
	Private BANano As BANano
	Public bcmpie As VMChartKick
	Public budgetByCat As VMChartKick
	Public expByCat As VMChartKick
	Public expByMonth As VMChartKick
End Sub

Sub Code
	Log("modDashboard.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(1).AddColumns2x6
	cont.AddRows(1).AddColumns12
	cont.AddRows(1).AddColumns2x6
	'
	Dim ec As VMContainer = AddExpense
	Dim bcm As VMContainer = AddBudgetCurrentMonth
	Dim bccm As VMContainer = AddBudgetByCategoryCurrentMonth
	Dim bccy As VMContainer = AddExpenditureByCategoryCurrentYear
	Dim ecy As VMContainer = AddExpenditureByMonthCurrentYear
	
	cont.AddComponent(1, 1, ec.tostring)
	cont.AddComponent(1, 2, bcm.tostring)
	cont.AddComponent(2, 1, bccm.tostring)
	cont.AddComponent(3, 1, ecy.tostring)
	cont.AddComponent(3, 2, bccy.tostring)
	'
	
	'add container to the page content
	vm.AddContainer(cont)
End Sub

Sub AddExpense As VMContainer
	expcont = vm.CreateContainer("expcont", Me)
	expcont.SetElevation(2)
	expcont.SetPaddingAll("20px")
	
	Dim expense_label As VMInputControl = expcont.NewH1("expense_label", "Add Expense")
	expcont.AddControl(expense_label, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	
	Dim expense_id As VMInputControl = expcont.NewText("id","#","",False,"",0,"","",0)
	expense_id.SetVisible(False).SetInt
	expcont.AddControl(expense_id, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	Dim expense_date As VMInputControl = expcont.NewDatePicker("expense_date", "Date", True, False, True, "",0)
	expcont.AddControl(expense_date, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_category As VMInputControl = expcont.NewSelect("expense_category","Category",True,False,"","categories","id","text","","The category should be specified!",0)
	expense_category.setint
	expcont.AddControl(expense_category, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_type As VMInputControl = expcont.NewSelect("expense_type","Type",True,False,"","types","id","text","","The type should be specified!",0)
	expense_type.setint
	expcont.AddControl(expense_type, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_amount As VMInputControl = expcont.NewTel("expense_amount", "Amount", "", True, "", "","The amount should be specified!",0)
	expense_amount.setdouble
	expcont.AddControl(expense_amount, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_description As VMInputControl = expcont.NewTextArea("expense_description", "Description", "", False, False, "",100, "","",0)
	expcont.AddControl(expense_description, 4, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	Dim labelx As VMInputControl = expcont.NewP("labelx", "Labelx").SetVisible(False)
	expcont.AddControl(labelx, 5, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	
	Dim btnSubmitExpense As VMInputControl = expcont.NewButton("btnSubmitExpense", "Submit", "", True, True, False, True)
	expcont.AddControl(btnSubmitExpense, 5, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'these should not be processed
	expcont.AddExclusion(Array("expense_label","labelx"))
	Return expcont
End Sub

Sub btnSubmitExpense_click(e As BANanoEvent)
	'get the data
	Dim expense As Map = expcont.GetData
	'validate the data
	Dim bValid As Boolean = vm.Validate(expense, expcont.Required)
	If bValid = False Then Return
	'
	'expense is valid
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.SchemaFromDesign(expcont)
	dbsql.RecordFromMap(expense)
	dbsql.Insert
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		expcont.setdefaults
		vm.ShowSnackBar("Expense added successfully!")
		Refresh
	Else
		Log("modDashboard.btnSubmitExpense_click: Error - " & dbsql.error)
		vm.ShowSnackBar(dbsql.error)
	End If
End Sub


Sub AddBudgetCurrentMonth As VMContainer
	Dim bcont As VMContainer = vm.CreateContainer("budgetcurrmonthcont", Me)
	bcont.SetElevation(2)
	bcont.SetPaddingAll("20px")
	bcont.AddRows(2).AddColumns12
	
	Dim lblx As VMLabel = vm.CreateLabel("lblx").SetH1.SetText("Budget (Current Month)")
	bcont.AddComponent(1, 1, lblx.tostring)
	'
	bcmpie = vm.CreateChartKick("bcmpie", Me).SetPieChart.SetStyleSingle("height", "345px")
	bcmpie.SetDonut
	bcont.AddComponent(2,1, bcmpie.tostring)
	
	Return bcont
End Sub


Sub AddBudgetByCategoryCurrentMonth As VMContainer
	Dim bcont As VMContainer = vm.CreateContainer("budgetcatcurrmonthcont", Me)
	bcont.SetElevation(2)
	bcont.SetPaddingAll("20px")
	bcont.AddRows(2).AddColumns12
	bcont.SetMargins("20px",0,0,0)
	
	Dim lblx As VMLabel = vm.CreateLabel("lblx").SetH1.SetText("Budget by Categories (Current Month)")
	bcont.AddComponent(1, 1, lblx.tostring)
	'
	budgetByCat = vm.CreateChartKick("budgetByCat", Me).SetColumnChart.SetStyleSingle("height", "345px")
	budgetByCat.SetDonut
	bcont.AddComponent(2,1, budgetByCat.tostring)
	
	Return bcont
End Sub

Sub AddExpenditureByCategoryCurrentYear As VMContainer
	Dim bcont As VMContainer = vm.CreateContainer("budgetcatcurryearcont", Me)
	bcont.SetElevation(2)
	bcont.SetPaddingAll("20px")
	bcont.AddRows(2).AddColumns12
	bcont.SetMargins("20px","20px",0,0)
	
	Dim lblx As VMLabel = vm.CreateLabel("lblx").SetH1.SetText("Expenditure by Categories (Current Year)")
	bcont.AddComponent(1, 1, lblx.tostring)
	'
	expByCat = vm.CreateChartKick("expByCat", Me).SetPieChart.SetStyleSingle("height", "345px")
	expByCat.SetDonut
	bcont.AddComponent(2,1, expByCat.tostring)
	Return bcont
End Sub

Sub AddExpenditureByMonthCurrentYear As VMContainer
	Dim bcont As VMContainer = vm.CreateContainer("budgetmonthcurryearcont", Me)
	bcont.SetElevation(2)
	bcont.SetPaddingAll("20px")
	bcont.AddRows(2).AddColumns12
	bcont.SetMargins("20px","20px",0,0)
	
	Dim lblx As VMLabel = vm.CreateLabel("lblx").SetH1.SetText("Expenditure by Month (Current Year)")
	bcont.AddComponent(1, 1, lblx.tostring)
	'
	expByMonth = vm.CreateChartKick("expByMonth", Me).SetColumnChart.SetStyleSingle("height", "345px")
	bcont.AddComponent(2,1, expByMonth.tostring)
	
	Return bcont
End Sub

Sub Refresh
	vm.pagepause
	bcmpie.Reset
	bcmpie.Refresh
	expByCat.Reset
	expByCat.Refresh
	budgetByCat.Reset
	budgetByCat.OverwriteOptions = False
	budgetByCat.Refresh
	expByMonth.Reset
	expByMonth.overwriteoptions = False
	expByMonth.Refresh
	
	'get expenditure for the month
	Dim cYear As String = vm.YearNow
	Dim cMonth As String = vm.monthnow
	'
	'budget per month
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Execute("select sum(budget) as budget from expensecategories")
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		Dim rec As Map = dbsql.result.get(0)
		Dim sbudget As String = rec.getdefault("budget",0)
		sbudget = BANano.parsefloat(sbudget)
		'
		Dim monthexp As BANanoMySQL
		monthexp.Initialize(Main.dbase, "expenses", "id")
		monthexp.Execute($"select sum(expense_amount) as amount from expenses where month(expense_date) = '${cMonth}' and year(expense_date) = '${cYear}' group by year(expense_date)"$)
		monthexp.json = BANano.CallInlinePHPWait(monthexp.methodname, monthexp.Build)
		monthexp.FromJSON
		If monthexp.OK Then
			Dim exp1 As Map = monthexp.result.get(0)
			Dim sexpense As String = exp1.get("amount")
			sexpense = BANano.parsefloat(sexpense)
			'make the chart able to update during run time
			bcmpie.AddXYMap(CreateMap("Budget":sbudget,"Expenses":sexpense))
			bcmpie.Refresh
		Else
			Log("modDashboard.Refresh: Error - " & dbsql.error)
		End If
	Else
		Log("modDashboard.Refresh: Error - " & dbsql.error)
	End If
	'get categories and budget for the month
	Dim cats As BANanoMySQL
	Dim catsm As Map = CreateMap()
	Dim expsm As Map = CreateMap()
	cats.Initialize(Main.dbase, "expensecategories", "id")
	cats.Execute("select * from expensecategories order by budget desc")
	cats.json = BANano.CallInlinePHPWait(cats.methodname, cats.Build)
	cats.FromJSON
	If cats.OK Then
		For Each rec As Map In cats.result
			Dim stext As String = rec.get("text")
			Dim sbudget As String = rec.get("budget")
			sbudget = BANano.parseFloat(sbudget)
			'
			catsm.put(stext, sbudget)
		Next
	Else
		Log("modDashboard.Refresh: Error - " & cats.error)
	End If
	'
	'expenses for this month
	Dim expqry As String = $"select sum(expenses.expense_amount) as amount, expensecategories.text as expense_category from expenses, expensecategories where expenses.expense_category = expensecategories.id and month(expense_date) = '${cMonth}' and year(expense_date) = '${cYear}' group by expensecategories.text"$
	Dim cats1 As BANanoMySQL
	cats1.Initialize(Main.dbase, "expenses", "id")
	cats1.Execute(expqry)
	cats1.json = BANano.CallInlinePHPWait(cats1.methodname, cats1.Build)
	cats1.FromJSON
	If cats1.OK Then
		For Each rec As Map In cats1.result
			Dim stext As String = rec.get("expense_category")
			Dim sbudget As String = rec.get("amount")
			sbudget = BANano.parseFloat(sbudget)
			'
			expsm.put(stext, sbudget)
		Next
	Else
		Log("modDashboard.Refresh: Error - " & cats.error)
	End If
	'consolidate the two
	Dim ser1 As Map = CreateMap()
	For Each k As String In catsm.Keys
		Dim v As String = catsm.Get(k)
		v = BANano.parseFloat(v)
		ser1.Put(k, v)
	Next
	'
	Dim ser2 As Map = CreateMap()
	For Each k As String In catsm.Keys
		If expsm.ContainsKey(k) Then
			Dim v As String = expsm.Get(k)
			v = BANano.parsefloat(v)
			ser2.put(k, v)
		Else
			ser2.Put(k,0)
		End If
	Next
	budgetByCat.AddSeries("Budget","",False,ser1)
	budgetByCat.AddSeries("Expenses","",False,ser2)
	budgetByCat.Refresh
	'
	'expenses For the year
	'expenses for this month
	Dim expqry1 As String = $"select sum(expenses.expense_amount) as amount, expensecategories.text as expense_category from expenses, expensecategories where expenses.expense_category = expensecategories.id and year(expense_date) = '${cYear}' group by expensecategories.text"$
	Dim cats2 As BANanoMySQL
	cats2.Initialize(Main.dbase, "expenses", "id")
	cats2.Execute(expqry1)
	cats2.json = BANano.CallInlinePHPWait(cats2.methodname, cats2.Build)
	cats2.FromJSON
	If cats2.OK Then
		For Each rec As Map In cats2.result
			Dim stext As String = rec.get("expense_category")
			Dim sbudget As String = rec.get("amount")
			sbudget = BANano.parseFloat(sbudget)
			'make the chart able to update during run time
			Dim opt As Map = CreateMap()
			opt.put(stext, sbudget)
			expByCat.AddXYMap(opt)
		Next
		expByCat.refresh
	Else
		Log("modDashboard.Refresh: Error - " & cats.error)
	End If
	'
	Dim expensesm As Map = CreateMap()
	expensesm.Put("Jan", 0)
	expensesm.Put("Feb", 0)
	expensesm.Put("Mar", 0)
	expensesm.Put("Apr", 0)
	expensesm.Put("May", 0)
	expensesm.Put("Jun", 0)
	expensesm.Put("Jul", 0)
	expensesm.Put("Aug", 0)
	expensesm.Put("Sep", 0)
	expensesm.Put("Oct", 0)
	expensesm.Put("Nov", 0)
	expensesm.Put("Dec", 0)
	
	Dim expqry2 As String =  $"select sum(expense_amount) as amount, month(expense_date) as period from expenses where year(expense_date) = '${cYear}' group by month(expense_date)"$
	Dim cats3 As BANanoMySQL
	cats3.Initialize(Main.dbase, "expenses", "id")
	cats3.Execute(expqry2)
	cats3.json = BANano.CallInlinePHPWait(cats3.methodname, cats3.Build)
	cats3.FromJSON
	If cats3.OK Then
		For Each rec As Map In cats3.result
			Dim stext As String = rec.get("period")
			Dim sbudget As String = rec.get("amount")
			sbudget = BANano.parseFloat(sbudget)
			Select Case stext
			Case "1"
				expensesm.Put("Jan", sbudget)
			Case "2"
				expensesm.Put("Feb", sbudget)
			Case "3"
				expensesm.Put("Mar", sbudget)
			Case "4"
				expensesm.Put("Apr", sbudget)
			Case "5"
				expensesm.Put("May", sbudget)
			Case "6"
				expensesm.Put("Jun", sbudget)
			Case "7"
				expensesm.Put("Jul", sbudget)
			Case "8"
				expensesm.Put("Aug", sbudget)
			Case "9"
				expensesm.Put("Sep", sbudget)
			Case "10"
				expensesm.Put("Oct", sbudget)
			Case "11"
				expensesm.Put("Nov", sbudget)
			Case "12"
				expensesm.Put("Dec", sbudget)
			End Select
		Next
		For Each k As String In expensesm.Keys
			Dim v As String = expensesm.Get(k)
			v = BANano.parsefloat(v)
			expByMonth.AddXY(k,v) 
		Next
		expByMonth.refresh
	Else
		Log("modDashboard.Refresh: Error - " & cats.error)
	End If
	vm.pageresume
End Sub