package com.example.hellpworldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class  MainActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private TextView subjectName_1;
    private TextView subjectName_2;
    private TextView subjectName_3;
    private TextView subjectName_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        subjectName_1=findViewById(R.id.subjectName1);
        subjectName_2=findViewById(R.id.subjectName2);
        subjectName_3=findViewById(R.id.subjectName3);
        subjectName_4=findViewById(R.id.subjectName4);
        ImageButton button1=(ImageButton)findViewById(R.id.backToInput);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityInputYourScore.class);
                startActivity(intent);
                finish();
            }
        });
        ImageButton button2=(ImageButton)findViewById(R.id.goToReport);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                finish();

            }
        });
        Intent intent=getIntent();
        String subjectName1=intent.getStringExtra("subjectName1");
        subjectName_1.setText(subjectName1);
        String subjectName2=intent.getStringExtra("subjectName2");
        subjectName_2.setText(subjectName2);
        String subjectName3=intent.getStringExtra("subjectName3");
        subjectName_3.setText(subjectName3);
        String subjectName4=intent.getStringExtra("subjectName4");
        subjectName_4.setText(subjectName4);



        Log.d("HellpWorldActivity", "onCreate execute");
    }
}