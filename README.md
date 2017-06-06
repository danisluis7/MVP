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
	 <a href="https://www.w3schools.com" target="_blank">Visit W3Schools.com!</a> 
</p>

		


		


	


	


		

