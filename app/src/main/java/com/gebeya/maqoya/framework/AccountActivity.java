package com.gebeya.maqoya.framework;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.gebeya.maqoya.framework.base.BaseActivity;

public class AccountActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.registerFragmentContainer,new RegisterFragment())
                .commit();
    }
}



