package com.example.medium;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {


    AppCompatButton signupButton;
    EditText edFName, edLName, edEmail, edPhone, edPassword;
    CheckBox checkbox;
    TextView loginText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        signupButton = findViewById(R.id.signupButton);
        edFName = findViewById(R.id.edFName);
        edLName = findViewById(R.id.edLName);
        edEmail = findViewById(R.id.edEmail);
        edPhone = findViewById(R.id.edPhone);
        edPassword = findViewById(R.id.edPassword);
        checkbox = findViewById(R.id.checkbox);
        loginText = findViewById(R.id.loginText);




        signupButton.setOnClickListener(view -> {
            // Get input values
            String firstNameText = edFName.getText().toString().trim();
            String lastNameText = edLName.getText().toString().trim();
            String emailText = edEmail.getText().toString().trim();
            String phoneText = edPhone.getText().toString().trim();
            String passwordText = edPassword.getText().toString().trim();
            boolean isTermsChecked = checkbox.isChecked();

            // Validation
            if (TextUtils.isEmpty(firstNameText)) {
                edFName.setError("First name is required");
                edFName.requestFocus();
            } else if (TextUtils.isEmpty(emailText)) {
                edEmail.setError("Email is required");
                edEmail.requestFocus();
            } else if (TextUtils.isEmpty(phoneText)) {
                edPhone.setError("Phone number is required");
                edPhone.requestFocus();
            } else if (TextUtils.isEmpty(passwordText)) {
                edPassword.setError("Password is required");
                edPassword.requestFocus();
            } else if (!isTermsChecked) {
                Toast.makeText(MainActivity.this, "You must agree to the terms", Toast.LENGTH_SHORT).show();
            } else {
                // All conditions are met, proceed to the next activity
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });





        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }// onCreate End Here




}// Public Class End Here