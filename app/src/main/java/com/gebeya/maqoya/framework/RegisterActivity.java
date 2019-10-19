package com.gebeya.maqoya.framework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.gebeya.maqoya.framework.base.BaseActivity;

public class RegisterActivity extends BaseActivity {

  TextView login;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);

    login = findViewById(R.id.loginTo);
    login.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(intent);
      }
    });

  }
}
