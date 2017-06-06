package com.lorence.notificationdemo.level1.Login.View.Login;

import android.content.Context;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.lorence.notificationdemo.level1.Login.SocialActivity;
import com.lorence.notificationdemo.level1.Login.Utils.Helper;
import com.lorence.notificationdemo.level1.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends SocialActivity implements ILoginView{

    private ArrayList<String> message = null;

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

    @OnClick(R.id.activity_login_loginButton)
    public void onLoginClick() {
        showProgressBarDialog();
        if(Helper.isNetworkAvailable(this)){
            // Connect the internet successfully

        }else{
            // Connect fail
            message = new ArrayList<>();
            message.add(getResources().getString(R.string.network_fail));
            // showErrorDialog(message);
        }
        inputModeKeyBoard();
    }

    @Override
    protected void initialize() {
        setColorStatusBar();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }

    @Override
    public int setColorStatusBar() { return R.color.bgSkypeTM; }

    @Override
    public void showProgressBarDialog() { showingProgressDialog();}

    @Override
    public void dismissProgressBarDialog() { dismissingProgressDialog();}

    @Override
    public Context getContext() {
        return this;
    }
}

