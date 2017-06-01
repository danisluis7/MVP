package com.example.enclaveit.tutorials.Model;

import com.example.enclaveit.tutorials.Presenter.OnLoginFinishedListener;

/**
 * Created by enclaveit on 01/06/2017.
 */

public interface LoginInteractor {
    public void login(String username, String password, OnLoginFinishedListener listener);
}
