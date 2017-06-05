package com.lorence.notificationdemo.level1.Login.View;

import android.content.Context;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.lorence.notificationdemo.level1.Login.SocialActivity;
import com.lorence.notificationdemo.level1.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends SocialActivity implements ILoginView{

    // FOR EXAMPLE 1: APPLYING @BindView
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


    // FOR EXAMPLE 2: DISTRIBUTING PROJECT FROM BACKEND TO CLIENT
    @Override
    protected void initialize() {
        setColorStatusBar();
    }


    /**
     *
     * Using available method in Class Abstract.
     *
     * @return return
     */
    // FOR EXAMPLE 3: TRANSFER DATA FROM CLIENT TO BACKEND PROCESSING
    @Override
    protected int getLayoutResource() {
        return R.layout.activity_login;
    }

    /**
     *
     * Using availabel method in Abstract to get statusBarColor from view and change.
     * Why Class require implemtation because with method will be definited by Abstract
     *
     * @return Change of view.
     */
    @Override
    public int setColorStatusBar() { return R.color.bgSkypeTM; }

    // FOR EXAMPLE 4: APPLYING EVENT CLICK(@OnClick)
    @OnClick(R.id.activity_login_loginButton)
    public void onLoginClick() {
        showProgressBarDialog();
    }

    /**
     *
     * Get definition showing ProgressDialog from inside Abstract
     * showProgressBarDiaglog(Interface) is difference with showProgressDiaglog(Abstract)
     *
     * @description Declare definition and wait flow excuting call
     * @return Using flow to excute(Perhaps, excuting will be definited inside Abstract(OnCreateView))
     */
    // FOR EXAMPLE 5: USING INTERFACE(CALL DECLARING FROM ABSTRACT)
    @Override
    public void showProgressBarDialog() { showingProgressDialog();}

    /**
     *
     * Get definition hidden ProgressDialog from inside Abstract
     *
     * @description Declare definition and wait flow excuting call
     * @return Using flow to excute(Perhaps, excuting will be definited inside Abstract(OnCreateView))
     */
    @Override
    public void dismissProgressBarDialog() { dismissingProgressDialog();}

    /**
     *
     * Get definition in here and using for
     *
     * @description Declare definition and wait flow excuting call
     * @return Using flow to excute(Perhaps, excuting will be definited inside Abstract(OnCreateView))
     */
    // FOR EXAMPLE 6: USING INTERFACE(DEFINITE IN HERE TO USE[PRIVATE])
    @Override
    public Context getContext() {
        return this;
    }
}

/** Summary
 *
 * FOR EXAMPLE 1: APPLYING @BindView
 * FOR EXAMPLE 2: DISTRIBUTING PROJECT FROM BACKEND TO CLIENT
 * FOR EXAMPLE 3: TRANSFER DATA FROM CLIENT TO BACKEND PROCESSING
 * FOR EXAMPLE 4: APPLYING EVENT CLICK(@OnClick)
 * FOR EXAMPLE 5: USING INTERFACE(CALL DECLARING FROM ABSTRACT)
 * FOR EXAMPLE 6: USING INTERFACE(DEFINITE IN HERE TO USE[PRIVATE])
 */
