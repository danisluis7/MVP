package com.example.enclaveit.tutorials.View;

/**
 * Created by enclaveit on 01/06/2017.
 */

public interface LoginPresenter {
    /**
     *
     * Receive data from view(user enter or not enter and click event button[LOGIN])
     *
     * @param email
     * @param password
     */
    public void validateCredentials(String email,String password);
}
