package com.lorence.notificationdemo.level1.Login.View.Home;

import android.support.v7.widget.Toolbar;

import com.lorence.notificationdemo.level1.Login.BaseActivity;
import com.lorence.notificationdemo.level1.R;

import butterknife.BindView;

/**
 * Created by enclaveit on 06/06/2017.
 */

public class HomeActivity extends BaseActivity{

    @BindView(R.id.activity_home_toolbar)
    Toolbar toolbar;

    @Override
    public int setColorStatusBar() {
        return R.color.colorAccent;
    }

    @Override
    protected void initialize() {
        this.setSupportActionBar(toolbar);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_home;
    }
}
