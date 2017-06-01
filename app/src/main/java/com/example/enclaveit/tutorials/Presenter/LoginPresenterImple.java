package com.example.enclaveit.tutorials.Presenter;

import com.example.enclaveit.tutorials.Model.LoginInteractor;
import com.example.enclaveit.tutorials.Model.LoginInteractorImpl;
import com.example.enclaveit.tutorials.View.LoginPresenter;
import com.example.enclaveit.tutorials.View.LoginView;

/**
 * Created by enclaveit on 01/06/2017.
 */

public class LoginPresenterImple implements OnLoginFinishedListener,LoginPresenter {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImple(LoginView loginView){
        /**
         *
         * Why you call loginView.showProgress() like loginPresenter.validateCredentials()
         * => Cause: loginView is using and if you call loginView won't be good.
         *
         * @param LoginView
         * @return
         */
        this.loginView = loginView;

        /**
         * Main (Where running to Model, running interface when process of interface will hidden behind Class implement it.
         */
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String email, String password) {
        /**
         * Call all objects declared from view
         */
        loginView.showProgress();
        loginInteractor.login(email, password, this);
    }

    @Override
    public void onEmailError() {
        /**
         *
         * So process not here and not call here, just declare
         *
         * @param
         * @return
         */
        loginView.setEmailError();
        loginView.hideProgress();
    }

    @Override
    public void onPasswordError() {
        /**
         *
         * So process not here and not call here, just declare
         *
         * @param
         * @return
         */
        loginView.setPasswordError();
        loginView.hideProgress();
    }

    @Override
    public void onSuccess() {
        /**
         *
         * So process not here and not call here, just declare
         *
         * @param
         * @return
         */
        loginView.navigateToHome();
    }
}
