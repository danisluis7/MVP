package com.lorence.notificationdemo.level1.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by enclaveit on 02/06/2017.
 */

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
    }

    /**
     *
     * Get the layout from resource id
     *
     * @return id of layout(int)
     */
    protected abstract int getLayoutResource();
}
