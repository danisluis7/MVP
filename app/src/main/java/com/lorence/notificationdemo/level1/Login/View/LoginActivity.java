package com.lorence.notificationdemo.level1.Login.View;

import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lorence.notificationdemo.level1.Login.SocialActivity;
import com.lorence.notificationdemo.level1.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends SocialActivity implements ILoginView{

    @BindView(R.id.activity_login_logoImageView)
    ImageView imgLogoSkype;

    @BindView(R.id.activity_login_titleTextView)
    TextView txTitle;

    @BindView(R.id.activity_login_emailEditText)
    EditText edtEmail;

    @BindView(R.id.activity_login_passwordEditText)
    EditText edtPassword;

    @BindView(R.id.activity_login_rememberMeCheckBox)
    CheckBox chkRememberMe;

    @BindView(R.id.activity_login_loginButton)
    Button btnLogin;

    @BindView(R.id.activity_login_registerTextView)
    TextView tvRegister;

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.activity_login_loginButton)
    public void onLoginClick() {
        showProgressBar();
    }

    @Override
    public void showProgressBar() {
        // TODO
        Toast.makeText(this,"Welcome you !!!",Toast.LENGTH_SHORT).show();
    }
}
