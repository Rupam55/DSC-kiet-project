package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView card1;
    CardView card2;
    CardView card3;
    CardView card4;
    EditText text12;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text);
        text2 = findViewById(R.id.text5);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        image1=findViewById(R.id.first);
        image2=findViewById(R.id.second);
        image3=findViewById(R.id.third);
        image4=findViewById(R.id.forth);
        card1 = findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = text1.getText().toString();
                Intent intent = new Intent(MainActivity.this, informationActivity.class);
                intent.putExtra("name",st);
                intent.putExtra("image",R.drawable.first);
                startActivity(intent);



            }
        });

        card2 = findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = text2.getText().toString();
                Intent intent = new Intent(MainActivity.this, informationActivity.class);
                intent.putExtra("name",st);
                intent.putExtra("image",R.drawable.second);
                startActivity(intent);



            }
        });


        card3 = findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = text3.getText().toString();
                Intent intent = new Intent(MainActivity.this, informationActivity.class);
                intent.putExtra("name",st);
                intent.putExtra("image",R.drawable.third);
                startActivity(intent);



            }
        });


        card4 = findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = text4.getText().toString();
                Intent intent = new Intent(MainActivity.this, informationActivity.class);
                intent.putExtra("name",st);
                intent.putExtra("image",R.drawable.forth);
                startActivity(intent);



            }
        });


    }
}