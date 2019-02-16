package com.example.loginresgister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText UsernameText;
    EditText PasswordText;
    EditText FirstText;
    EditText LastText;
    EditText DOBText;
    EditText EmailText;
    EditText ConfirmText;
    Button LoginButton;
    Button GoToButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        UsernameText = findViewById(R.id.username);
        PasswordText = findViewById(R.id.password);
        ConfirmText = findViewById(R.id.confirm);
        FirstText = findViewById(R.id.firstname);
        LastText = findViewById(R.id.lastname);
        DOBText = findViewById(R.id.DOB);
        EmailText = findViewById(R.id.email);
        LoginButton = (Button)findViewById(R.id.login);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname = FirstText.getText().toString().trim();
                String lastname = LastText.getText().toString().trim();
                String username = UsernameText.getText().toString().trim();
                String pass = PasswordText.getText().toString().trim();
                String conpass = ConfirmText.getText().toString().trim();
                String dob = DOBText.getText().toString().trim();
                String email = EmailText.getText().toString().trim();

                if(firstname.length() < 3 || firstname.length() >30){
                    FirstText.setError("Invalid input.");
                }else if (lastname.length() == 0){
                    LastText.setError("Invalid input.");
                }else if (username.length() == 0){
                    UsernameText.setError("Invalid input.");
                }else if (pass.length() == 0){
                   PasswordText.setError("Invalid input.");
                }else if (conpass.length() == 0){
                    ConfirmText.setError("Invalid input.");
                }else if (dob.length() == 0){
                    DOBText.setError("Invalid input.");
                }else if (email.length() == 0){
                    EmailText.setError("Invalid input.");
                }else{
                    if(pass.equals(conpass)){
                        Toast.makeText(RegisterActivity.this,"You have been registered!",Toast.LENGTH_SHORT).show();
                        Intent moveToLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(moveToLogin);
                    }else{
                        Toast.makeText(RegisterActivity.this,"Password not matching.",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        GoToButton = (Button)findViewById(R.id.GoTo);
        GoToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(LoginIntent);
            }
        });
    }
}
