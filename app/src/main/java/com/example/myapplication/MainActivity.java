package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView card1;
    EditText text1;
    TextView textiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textiles = findViewById(R.id.text);
        card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = textiles.getText().toString();
                Intent intent = new Intent(MainActivity.this, informationActivity.class);
                intent.putExtra("name",st);
                startActivity(intent);
                finish();
            }
        });
    }
}