package com.gebeya.maqoya.framework.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.gebeya.maqoya.framework.util.Util;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        d("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        d("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        d("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        d("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        d("onDestroy");
    }

    protected void d(String message)
    {
        Util.d(this,message);
    }

}
