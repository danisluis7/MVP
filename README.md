# WELCOME TO ABSTRACT ACTIVITY [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)
================================
=/ - Nickname: "Lorence"
=/ - Hopies: Socer and Chess
=/ - Major: Programmer
=/ - Address: VietName
================================

- [Extends CommonActivity](#extends-commonactivity)
- [For example](#for-example)

## Extends CommonActivity
	- STEP 1: Using technical Abstract with current project
	+ extends class Abstract => you will using availabel methods in abstract. There are two cases for you:
		- Case one: Running automatically with process that set out inside abstract
		- Case two: Running not automatically that need parameter from outside(View)
		+ Simple: MainActivity extends BaseActivity
		+ Level 1: LoginActivity extends abstract SocialActivity extends abstract BaseActivity
		+ Level 2: LoginActivity extends ....... extends abstract BaseActivity()

## For example
	- STEP 2: Code and try to run
		- How many handling in Activity Login ?
		+ Handling 1: Inflate view from XML
			- Is there any another Activity using this handling above?
			+ YES:  Abstract to handle and extends from Abstract(x). Applying Abstract Design Pattern in Java.
			+ NO :  Implement in here. We put handling in here.
		+ Handling 2: Login with social network such as: Facebook or Google.
			- Relizing that there are so many methods to handle. That's main reason you should seprate to Abstract and put process in there.
		- How can I code ?
		+ Implement viewing UI when I run LoginActivity

- [Level 1](#level-1)
- [Level 1.1](#for-example)

##Level 1

	- REQUEST 1: Inflate sucessfully and show view successfully.
<p align="center">
	<img src="https://github.com/danisluis7/MVP/blob/level1/1.png" alt="1.png"/>
</p>
	- ANALYSIS: We need to add some attributes nessary when view UI for user. For example:
	+ Change color StatusBar on Android
	+ Change color Toolbar before view 
	+ Change title of Toolbar before view 
	+ Change Animation of Screen before view
	+ Show Start Screen before jumping into Login Screen.[PRIVATE]

	- FIlTER these requirements above and organize follow 
	+ Which one is common all Activity and put handle inside Abstract to handle
	+ Which one is private of every Activity and put here in that Activity and handle

	- CONTINUE : Show Start Screen before jumping into Login Screen.[PRIVATE]. Or you understand following other way such as: How to provide animation when calling another activity in Android?
	+ .....
	
	- APPLYING MVP : HOW CAN I APPLY INTERFACE - LEVEL 1[VIEW](VIEW)
	+ Case One: I show problem and solution to resolve it.
<p align="center">
	<img src="https://github.com/danisluis7/MVP/blob/level1/2.png" alt="2.png"/>
</p>
	=> With Java Swing: We don't call Interface in static function.
<p align="center">
	<img src="https://github.com/danisluis7/MVP/blob/level1/3.png" alt="3.png"/>
</p>
	=> With Android: We call Interface by Event Click (Button or TextView)
	- In my branch, I will organize code follow stype below:
		.root/Login/
		.root/Login/View/LoginActivity.Java
		.root/Login/View/ILoginView.Java

		.root/Login/Presenter/LoginPresenter.java
		.root/Login/Presenter/LoginPresenterImpl.java

		.root/Login/Model/LoginInteractor.java
		.root/Login/Model/LoginInteractorImpl.java
	
	- With way above. I realise that every won't be ok. I learned two ways to handle
	+ First: 
		.root/Login/LoginActivity.java
		.root/Login/ILoginView.java	
		.root/Login/LoginPresenter.java
		.root/Login/LoginPresenterImpl.java
		.root/Login/LoginInteractor.java
		.root/Login/LoginInteractorImpl.java
	+ Second:
		.root/View/LoginActivity.java
		.root/View/ILoginView.java

		.root/Presenter/LoginPresenter.java
		.root/Presenter/LoginPresenterImpl.java
		
		.root/Model/LoginInteractor.java
		.root/Model/LoginInteractorImpl.java
		
	+ Case Two: 
	- REQUEST 2: 
	


		

