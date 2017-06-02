package com.lorence.notificationdemo.level1.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by enclaveit on 02/06/2017.
 */

public abstract class BaseActivity extends AppCompatActivity{

    private Unbinder unbinder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        unbinder = ButterKnife.bind(this);
    }

    /**
     *
     * Get the layout from resource id
     *
     * @return id of layout(int)
     */
    protected abstract int getLayoutResource();
}
