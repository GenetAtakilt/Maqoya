package com.gebeya.maqoya.framework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.gebeya.maqoya.framework.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        TextView register;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        register = findViewById(R.id.registerTo);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
