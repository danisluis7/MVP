# WELCOME TO ABSTRACT ACTIVITY [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)
================================
=/ - Nickname: "Lorence"
=/ - Hopies: Socer and Chess
=/ - Major: Programmer
=/ - Address: VietName
================================

/** Summary VIEW
 *
 * FOR EXAMPLE 1: APPLYING @BindView
 * FOR EXAMPLE 2: DISTRIBUTING PROJECT FROM MODEL TO VIEW
 * FOR EXAMPLE 3: TRANSFER DATA FROM VIEW TO MODEL PROCESSING
 * FOR EXAMPLE 4: APPLYING EVENT CLICK(@OnClick)
 * FOR EXAMPLE 5: USING INTERFACE(CALL DECLARING FROM ABSTRACT)
 * FOR EXAMPLE 6: USING INTERFACE(DEFINITE IN HERE TO USE[PRIVATE])
 * FOR EXAMPLE 7: CALL ABSTRACT METHOD TO EXCUTE DIRECTLY 
 */

- HOW CAN I APPLY EXAMPLE:
	+ I wanna hidden inputModeKeyBoard().
		- Search the internet to get KeyBoard "Close/hide the Android Soft Keyboard"
<p align="center">
	<img src="https://github.com/danisluis7/MVP/blob/level2/1.png" alt="1.png"/>
</p> 

	+ Event
		- Event from wiget Android such as: TextView, Button, ImageView, ...
		- Event from InputModelKeyBoard => We need to catch InputModelKeyBoard

	+ How can I control event click from InputModelKeyBoard ?
	+ How can we call Login when user click KEYCODE_ENTER in INPUTMODEKEYBOARD
	
	View.OnKeyListener onKeyListener = new View.OnKeyListener() {
        @Override
        public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
            if (keyEvent.getAction() == KeyEvent.ACTION_DOWN)
            {
                switch (keyCode)
                {
                    case KeyEvent.KEYCODE_DPAD_CENTER:
                    case KeyEvent.KEYCODE_ENTER:
                        SignIn();
                        return true;
                    case KeyEvent.KEYCODE_SPACE:
                        return true;
                    default:
                        break;
                }
            }
            return false;
        }
    };
	- With @OnClick(). We can share process after click button or Click Enter on Keyboard is easily

	+ How can I share method onBackPressed();?
	- Easily
		// Call from toolbar
		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

		// Call default from ActivityAppCompat
		@Override
		public void onBackPressed() {
			hideInputKeyBoard();
			super.onBackPressed();
			overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
		}

	+ How can I detect whether there is an Internet connection available on Android
<p align="center">
	<img src="https://github.com/danisluis7/MVP/blob/level2/3.png" alt="3.png"/>
</p> 

	+ How can I definite message to inform error in view?
		- Find type of screen to show message or way to show message. [Simple Snackbar Android]
		- Update library: DialogPlus(Default in Android)
		- Follow link to get DialogBus: https://github.com/orhanobut/dialogplus/blob/master/dialogplus/src/main/java/com/orhanobut/dialogplus/DialogPlus.java
		- We need to custom and show user about message that you want to show in View.
<p align="center">
	<img src="https://github.com/danisluis7/MVP/blob/level2/4.png" alt="4.png"/>
</p>
<p align="center">
	<img src="https://github.com/danisluis7/MVP/blob/level2/5.png" alt="5.png"/>
</p>
		- Declare ArrayList<String> and apply template EXAMPLE 5

	+ How can we custom DialogBus?

		- Unit test talk about how can I use it ? [UNIT TEST]

<p align="center">
	  <a href="https://raw.githubusercontent.com/danisluis7/MVP/level2/app/src/tutorial/DialogPlusTest.java" target="_blank">Visit Tutorial</a> 
</p>

	+ How can we use Retrofit?
	
		- This problem in here: Normally, We usually choose new method instead of POST and GET.
		- Move to process to another place like ... and implement.

	- We find about  TMDb API. What is it?
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/6.png" alt="6.png"/>
	</p>

	- Setting dependencies
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/7.png" alt="7.png"/>
	</p>
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/8.png" alt="8.png"/>
	</p>

	- How can manage link with Retrofit2. We use interface and definite method inside Interface. 
		+ DECLARATION
			- Declare object that reponse from serve side.[MoviesResponse]
			- Declare these Librabry that we use.
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/9.png" alt="9.png"/>
	</p>
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/10.png" alt="10.png"/>
	</p>
	
	- What is the definition of @Path, @Query, @Body, @Header.
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/11.png" alt="11.png"/>
	</p>
		- @Body   : Push data from client to server and check exist of data on service. [POST]
		- @Query  : Get data from serve by key [GET]
		- @Part   : 
		- @Header :

	- Object will be presented as AsynTask. We using com.google.gson.annotations.SerializedName to receive data from serve[JSON].
We need to observe below:
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/12.png" alt="12.png"/>
	</p>
	<p align="center">
		<img src="https://github.com/danisluis7/MVP/blob/level2/13.png" alt="13.png"/>
	</p>
	* From data return is Object. In normal way, we will create package with name is Model to contain. In here, model will be pointed "MVP". And we replace with another name is "Entire,...".

		


		


	


	


		

