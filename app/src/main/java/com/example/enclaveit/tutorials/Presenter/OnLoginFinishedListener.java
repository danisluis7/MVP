package com.example.enclaveit.tutorials.Presenter;

/**
 * Created by enclaveit on 01/06/2017.
 */

public interface OnLoginFinishedListener {
    /**
     *
     * So process not here and not call here, just declare
     *
     * @param
     * @return
     */
    public void onEmailError();
    public void onPasswordError();

    public void onSuccess();
}
