package com.lorence.notificationdemo.level1.Login.View;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import com.lorence.notificationdemo.level1.Login.View.Login.LoginActivity;
import com.lorence.notificationdemo.level1.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by enclaveit on 06/06/2017.
 */
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity mActivity = null;

    @Before
    public void setUp() throws Exception{
        mActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testLauch(){
        /**
         * @Test
         */
        View view = mActivity.findViewById(R.id.activity_login_emailEditText);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception{
        mActivity = null;
    }

}