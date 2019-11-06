package com.gebeya.maqoya.framework.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;

import com.gebeya.maqoya.framework.MainActivity1;
import com.gebeya.maqoya.framework.R;
import com.gebeya.maqoya.framework.base.BaseActivity;
import com.gebeya.maqoya.framework.register.RegisterActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    EditText  editTextEmail, editTextPassword;
    TextView register;
    Button  login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        register = findViewById(R.id.registerTo);
        login = findViewById(R.id.login);

        register.setOnClickListener(this);
        login.setOnClickListener(this);



//        register = findViewById(R.id.registerTo);
//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent  intent = new Intent(LoginActivity.this, RegisterActivity.class);
//                startActivity(intent);
//            }
//        });



//        login = findViewById(R.id.login);
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, MainActivity1.class);
//                startActivity(intent);
//            }
//        });




    }

    private void userLogin()
    {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();


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

    }

    private void login()
    {
        Intent intent = new Intent(LoginActivity.this, MainActivity1.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.login:

                userLogin();
                login();
                break;

            case  R.id.registerTo:

                break;
        }
    }
}
