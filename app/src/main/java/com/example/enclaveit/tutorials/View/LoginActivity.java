package com.example.enclaveit.tutorials.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.enclaveit.tutorials.MainActivity;
import com.example.enclaveit.tutorials.R;

public class LoginActivity extends Activity implements LoginView, View.OnClickListener{

    private ProgressBar progressBar;
    private EditText email;
    private EditText password;

    /**
     *
     * Receive data from user and transfer this data
     * to present and excute in present
     *
     * @param savedInstanceState
     */
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intiComponents();

        email = (EditText)this.findViewById(R.id.email);
        password = (EditText)this.findViewById(R.id.password);
        setContentView(R.layout.activity_login);

        /**
         * Actually, I think interface to call event click when user click button
         * => Implement View.OnClick
         */
        findViewById(R.id.btnLogin).setOnClickListener(this);
    }
    private void intiComponents() {
        /**
         * Set fullscreen and title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setEmailError() {
        /**
         *
         * We establish object to contain message about error
         * after that informing outside(Using available method in Android)
         *
         * @param
         * @return
         */
        email.setError("Please make sure you enter your email address correctly");
    }

    @Override
    public void setPasswordError() {
        /**
         *
         * We establish object to contain message about error
         * after that informing outside(Using available method in Android)
         *
         * @param
         * @return
         */
        password.setError("Please make sure you enter your password correctly");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this,MainActivity.class));
    }


    @Override
    public void onClick(View v) {
        // From OnCreate => OnClick
        // All functions that you declare above => look likes intializing variables

        /**
         *
         * From onCreate => OnCreate
         * All functions that you declare above => looks like intializing variables
         *
         * @param
         * @return
         */
        loginPresenter.validateCredentials(String.valueOf(email.getText()),String.valueOf(password.getText()));
    }
}
