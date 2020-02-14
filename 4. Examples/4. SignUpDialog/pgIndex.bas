﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Private vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	'update the nav bar title
	vm.navbar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.SetTitle("Login Dialog")
	vm.Drawer.SetTitle("Login")
	vm.Drawer.SetPersistentFull(True)
	'the navbar will be hidden
	vm.NavBar.Hide
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'hide the back button
	vm.NavBar.SetHasBackButton(False)
	'show the hamburger button
	vm.NavBar.SetHasMenuButton(False)
	
	'add the drawer items
	'add the code from the modules
	vm.AddPage(pgLogin.name, pgLogin)
	vm.AddPage(pgRegister.name, pgRegister)
	'show the dialog when page opens
	vm.ShowDialog("mdlsignin")
	'build the page
	vm.ux
End Sub
