package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class informationActivity extends AppCompatActivity {

    EditText text1;
    TextView text2;
    Button button;
    String text3;
    TextView text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);


        text1=findViewById(R.id.text7);
        text4=findViewById(R.id.text6);
        text2=findViewById(R.id.text5);
        button=findViewById(R.id.button);

        Bundle bn = getIntent().getExtras();
        String st = bn.getString("name");
        text4.setText(String.valueOf(st));



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String st = text1.getText().toString();
                String st2 = text2.getText().toString();
                Toast.makeText(informationActivity.this, st+ "\n"+st2, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
