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
	- REQUEST 2: Override onCreate() and write Dialog show before Login
	


		

