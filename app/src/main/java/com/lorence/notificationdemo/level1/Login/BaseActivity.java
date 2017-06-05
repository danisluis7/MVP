package com.lorence.notificationdemo.level1.Login;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.lorence.notificationdemo.level1.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by enclaveit on 02/06/2017.
 */

public abstract class BaseActivity extends AppCompatActivity{

    private Unbinder unbinder;
    protected ProgressDialog mProgressDialog;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        unbinder = ButterKnife.bind(this);
        getStatusBarColor(setColorStatusBar());
        initialize();
    }

    /**
     *
     * Definite set Status Bar Color for Android.
     *
     * Set Horizontal
     *
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void getStatusBarColor(int color){
        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,color));
    }

    public abstract int setColorStatusBar ();
    /**
     *
     * @desription: We want to divide into small process and put it in another class. We need to declare Abstract
     * Function anc call.
     *
     * @return : Excute finally
     *
     */
    protected abstract void initialize();

    /**
     *
     * Get the layout from resource id
     *
     * @return id of layout(int)
     */
    protected abstract int getLayoutResource();

    public void showingProgressDialog(){
        if(mProgressDialog == null){
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setCancelable(true);

            mProgressDialog.setMessage(getString(R.string.loading));
            mProgressDialog.setProgress(0);
        }

        if(!mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
    }

    public void dismissingProgressDialog(){
        try {
            if (mProgressDialog != null) {
                if (mProgressDialog.isShowing()) {
                    mProgressDialog.dismiss();
                }
            }
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public void inputModeKeyBoard(){
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void showErrorDialog(String message){
        // Using DialogPlus(Abstract extend Abstract ...)
    }
}
