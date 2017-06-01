package com.example.enclaveit.tutorials.View;

/**
 * Created by enclaveit on 01/06/2017.
 * no parameter
 */
public interface LoginView {
    /**
     *
     * Show you the progressBar
     *
     * @param
     * @return
     */
    public void showProgress();


    /**
     *
     * Hide the progressBar
     *
     * @param
     * @return
     */
    public void hideProgress();

    /**
     *
     * set up error when Username is wrong
     *
     * @param
     * @return
     */
    public void setEmailError();


    /**
     *
     * set up error when Password is wrong
     *
     * @param
     * @return
     */
    public void setPasswordError();

    /**
     *
     * Route or Navigate to Home Screen
     *
     * @param
     * @return
     */
    public void navigateToHome();
}
