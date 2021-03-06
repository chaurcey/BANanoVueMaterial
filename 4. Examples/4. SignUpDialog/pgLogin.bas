﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "signincode"
	Private mdlSignIn As VMDialog
End Sub


Sub Code(vmx As BANanoVM)
	'the instance of view material
	vm = vmx
	'create the modal dialog
	mdlSignIn = vm.CreateDialog("mdlsignin", Me)
	'dont show the backdrop
	mdlSignIn.SetBackdrop(False)
	'disable clicking outside of modal
	mdlSignIn.SetClickOutsideToClose(False)
	'dont close when a user presses escape
	mdlSignIn.SetCloseOnEsc(False)
	'on cellphones show full screen
	mdlSignIn.SetFullScreen(True)
	'set width of the modal
	mdlSignIn.SetWidth("600px")
	'
	'set the title of the modal
	mdlSignIn.SetTitle("Sign In")
	'add a cancel button
	mdlSignIn.AddCancel("btnRegister", "Register")
	'add a login button
	mdlSignIn.AddOk("btnOkSignIn", "Sign In")
	'create the controls
	Dim txtEmail As VMInputControl = vm.NewEmail("email","Email Address","",True,"email","Enter email address here", "The email address is required!",0)
	Dim txtPassword As VMInputControl = vm.NewPassword("password","Password","",True,True,"lock",10,"Enter password here","The password is required!",0)
	Dim chkRemember As VMInputControl = vm.NewCheckBox("remember", "Remember Me", "1","0", True, -1)
	
	'add the controls, the grid will be automatically created
	mdlSignIn.Container.AddControl(txtEmail,1,1,0,0,0,0,12,12,12,12)
	mdlSignIn.Container.AddControl(txtPassword,2,1,0,0,0,0,12,12,12,12)
	mdlSignIn.Container.AddControl(chkRemember,3,1,0,0,0,0,12,12,12,12)
	
	'add this modal to the page
	vm.adddialog(mdlSignIn)
End Sub

Sub btnRegister_click(e As BANanoEvent)
	'hide the signin dialog
	vm.HideDialog("mdlsignin")
	'show the register dialog
	vm.ShowDialog("mdlregister")
End Sub

Sub btnOkSignIn_click(e As BANanoEvent)
	'get the contents of the form
	Dim rec As Map = mdlSignIn.Container.GetData
	'validate the details
	Dim bValid As Boolean = mdlSignIn.Container.Validate(rec)
	If bValid = False Then Return
	Log(rec)
	'process further
End Sub
