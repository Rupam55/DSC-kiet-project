package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class startActivity extends AppCompatActivity {
    private static int  SPLASH_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent = new Intent(startActivity.this, MainActivity.class);
                startActivity(homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}