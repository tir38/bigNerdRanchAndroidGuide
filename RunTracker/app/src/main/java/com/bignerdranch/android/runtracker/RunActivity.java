package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

public class RunActivity extends SingleFragmentActivity {

    @Override
    protected Fragment getFragment() {
        return new RunFragment();
    }
}