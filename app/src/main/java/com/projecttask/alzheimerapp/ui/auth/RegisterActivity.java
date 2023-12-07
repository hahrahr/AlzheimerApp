package com.projecttask.alzheimerapp.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.projecttask.alzheimerapp.R;

import java.security.PrivateKey;

public class RegisterActivity extends AppCompatActivity {

    EditText  RegisterUserName , RegisterEmail, RegisterPhone, RegisterPassword, RegisterConfirmPassword;
    TextView register_text_login;
    Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        RegisterUserName.findViewById(R.id.RegisterUserName);
        RegisterEmail.findViewById(R.id.RegisterEmail);
        RegisterPhone.findViewById(R.id.RegisterPhone);
        RegisterPassword.findViewById(R.id.RegisterPassword);
        RegisterConfirmPassword.findViewById(R.id.RegisterConfirmPassword);
        register_text_login.findViewById(R.id.register_text_login);
        signUpBtn.findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(v -> {

        });

    }
    private void ValidationData(){
        String name =RegisterUserName.getText().toString().trim();
        String email =RegisterEmail.getText().toString().trim();
        String phone =RegisterPhone.getText().toString().trim();
        String password =RegisterPassword.getText().toString().trim();
        String confirmPassword =RegisterConfirmPassword.getText().toString().trim();

        if (name.isEmpty()) {
            Toast.makeText(RegisterActivity.this, R.string.please_enter_your_username, Toast.LENGTH_SHORT).show();
            RegisterUserName.findFocus();
            return;
        }if (email.isEmpty()) {
            Toast.makeText(RegisterActivity.this, R.string.please_enter_your_email, Toast.LENGTH_SHORT).show();
            RegisterEmail.findFocus();
            return;

        }if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(RegisterActivity.this, R.string.please_enter_Valid_email, Toast.LENGTH_SHORT).show();
            RegisterEmail.findFocus();
            return;

        }if (phone.isEmpty()){
            Toast.makeText(RegisterActivity.this, R.string.please_enter_your_Phone, Toast.LENGTH_SHORT).show();
            RegisterPhone.findFocus();
            return;
        }if (phone.length() <11){
            Toast.makeText(RegisterActivity.this, R.string.Phone_Should_be_11_char, Toast.LENGTH_SHORT).show();
            RegisterPhone.findFocus();
            return;
        }if (password.isEmpty()){
            Toast.makeText(RegisterActivity.this, R.string.please_enter_your_Password, Toast.LENGTH_SHORT).show();
            RegisterPassword.findFocus();
            return;
        }
    }
}