package com.gebeya.maqoya.framework.register;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.gebeya.maqoya.framework.LoginActivity;
import com.gebeya.maqoya.framework.R;
import com.gebeya.maqoya.framework.base.BaseActivity;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

  EditText editTextName, editTextEmail, editTextPassword, editTextConfirmPassword;
  Button register;
  TextView login;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);

    editTextName = findViewById(R.id.name);
    editTextEmail = findViewById(R.id.email);
    editTextPassword = findViewById(R.id.password);
    editTextConfirmPassword = findViewById(R.id.confirm_password);
    register = findViewById(R.id.register);
    login = findViewById(R.id.loginTo);


    register.setOnClickListener(this);
    login.setOnClickListener(this);



  }

  private void parentRegistration()
  {
    String name  = editTextName.getText().toString().trim();
    String email = editTextEmail.getText().toString().trim();
    String password = editTextPassword.getText().toString().trim();
    String confirmPassword = editTextConfirmPassword.getText().toString().trim();


    if(email.isEmpty())
    {
      editTextEmail.setError("Email is required");
      editTextEmail.requestFocus();
      return;
    }

    if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
    {
      editTextEmail.setError("Enter a valid Email");
      editTextEmail.requestFocus();
      return;
    }

    if (password.isEmpty())
    {
     editTextPassword.setError("Password is required");
     editTextPassword.requestFocus();
        return;
    }

    if (password.length() < 6)

    {
        editTextPassword.setError("Password should be atleast 6 character long");
        editTextPassword.requestFocus();
        return;

    }

    if (confirmPassword.isEmpty())
    {
      editTextConfirmPassword.setError("Password is required");
      editTextConfirmPassword.requestFocus();
        return;
    }

    if (confirmPassword.length() < 6)

    {
        editTextConfirmPassword.setError("Password is required");
        editTextConfirmPassword.requestFocus();
        return;
    }

    Call<ResponseBody> responseBodyCall = RetrofitClient
            .getRetrofitClient()
            .registerApiService()
            .registerUser(name,email,password,confirmPassword);

    responseBodyCall.enqueue(new Callback<ResponseBody>() {
      @Override
      public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

        try {
          String s = response.body().string();
          Toast.makeText(RegisterActivity.this, s, Toast.LENGTH_LONG).show();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      @Override
      public void onFailure(Call<ResponseBody> call, Throwable t) {

        Toast.makeText(RegisterActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();

      }
    });

  }

  private void login()
  {
      Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
      startActivity(intent);
  }

  @Override
  public void onClick(View v) {

    switch (v.getId())
    {
      case R.id.register:

        parentRegistration();
        break;

      case  R.id.loginTo:
          login();
        break;
    }

  }
}
