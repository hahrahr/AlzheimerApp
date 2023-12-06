package com.projecttask.alzheimerapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.projecttask.alzheimerapp.R;
import com.projecttask.alzheimerapp.ui.auth.RegisterActivity;

public class IntroActivityOne extends AppCompatActivity {
    protected Button intButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_one);

        intButton = findViewById(R.id.introBtn);

        intButton.setOnClickListener(View ->{
            Intent intent = new Intent(IntroActivityOne.this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });

    }

}