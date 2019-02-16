package com.example.loginresgister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText UsernameText;
    EditText PasswordText;
    Button LoginButton;
    Button RegisterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UsernameText = (EditText)findViewById(R.id.username);
        PasswordText = (EditText)findViewById(R.id.password);
        LoginButton = (Button)findViewById(R.id.login);
        RegisterButton = (Button)findViewById(R.id.register);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class) ;
                startActivity(registerIntent);
            }
        });
    }
}
