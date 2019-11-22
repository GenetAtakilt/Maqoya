package com.gebeya.maqoya;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

import com.gebeya.maqoya.base.BaseActivity;
import com.gebeya.maqoya.framework.R;
import com.gebeya.maqoya.screens.onbording.slidePagerActivity;

public class SplashActivity extends BaseActivity {

    Handler handler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, slidePagerActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
