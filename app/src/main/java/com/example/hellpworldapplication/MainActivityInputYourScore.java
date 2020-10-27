package com.example.hellpworldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivityInputYourScore extends AppCompatActivity {
    private Button button;
    private EditText subjectName1;
    private EditText subjectName2;
    private EditText subjectName3;
    private EditText subjectName4;
    private EditText score1;
    private EditText score2;
    private EditText score3;
    private EditText score4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main2);
        subjectName1=findViewById(R.id.subjectName1);
        subjectName2=findViewById(R.id.subjectName2);
        subjectName3=findViewById(R.id.subjectName3);
        subjectName4=findViewById(R.id.subjectName4);
        score1=findViewById(R.id.score1);
        score2=findViewById(R.id.score2);
        score3=findViewById(R.id.score3);
        score4=findViewById(R.id.score4);



        ImageButton button =(ImageButton)findViewById(R.id.goToAssessment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityInputYourScore.this, MainActivity.class);
                intent.putExtra("subjectName1", subjectName1.getText().toString().trim());
                intent.putExtra("subjectName2", subjectName2.getText().toString().trim());
                intent.putExtra("subjectName3", subjectName3.getText().toString().trim());
                intent.putExtra("subjectName4", subjectName4.getText().toString().trim());
                intent.putExtra("score1",score1.getText().toString().trim());
                intent.putExtra("score2",score2.getText().toString().trim());
                intent.putExtra("score3",score3.getText().toString().trim());
                intent.putExtra("score4",score4.getText().toString().trim());
                startActivity(intent);
                finish();


            }
        });
    }
}