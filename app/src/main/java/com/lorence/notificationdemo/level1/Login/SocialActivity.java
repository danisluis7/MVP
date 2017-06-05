package com.lorence.notificationdemo.level1.Login;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;

import butterknife.ButterKnife;

/**
 * Created by enclaveit on 02/06/2017.
 */

public abstract class SocialActivity extends BaseActivity{
    // TODO

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
