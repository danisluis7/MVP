package com.example.enclaveit.tutorials.Model;

import android.os.Handler;
import android.text.TextUtils;

import com.example.enclaveit.tutorials.Presenter.OnLoginFinishedListener;

/**
 * Created by enclaveit on 01/06/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onEmailError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
