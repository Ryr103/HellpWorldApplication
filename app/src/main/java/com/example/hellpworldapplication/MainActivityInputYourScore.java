package com.example.hellpworldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import javax.xml.validation.Validator;

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
    private EditText credit1;
    private EditText credit2;
    private EditText credit3;
    private EditText credit4;
    private Toast toast;


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
        credit1=findViewById(R.id.credit1);
        credit2=findViewById(R.id.credit2);
        credit3=findViewById(R.id.credit3);
        credit4=findViewById(R.id.credit4);





            ImageButton button = (ImageButton) findViewById(R.id.goToAssessment);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Score1=score1.getText().toString();
                    String Score2=score2.getText().toString();
                    String Score3=score3.getText().toString();
                    String Score4=score4.getText().toString();
                    String Credit1=credit1.getText().toString();
                    String Credit2=credit2.getText().toString();
                    String Credit3=credit3.getText().toString();
                    String Credit4=credit4.getText().toString();
                    String Subjectname1=subjectName1.getText().toString().trim();
                    String Subjectname2=subjectName2.getText().toString().trim();
                    String Subjectname3=subjectName3.getText().toString().trim();
                    String Subjectname4=subjectName4.getText().toString().trim();
                       Intent intent;
                     if(Score1.length()==0 || Score2.length()==0 || Score3.length()==0 || Score4.length()==0 || Credit1.length()==0 ||Credit2.length()==0 || Credit3.length()==0 || Credit4.length()==0 || Subjectname1.length()==0 || Subjectname2.length()==0 || Subjectname3.length()==0 || Subjectname4.length()==0)
                     {   Toast.makeText(MainActivityInputYourScore.this,"请输入有效数据(不要输入空格或空输入！)",Toast.LENGTH_LONG).show();
                     return;
                     }
                    else
                    {intent = new Intent(MainActivityInputYourScore.this, MainActivity.class);
                        intent.putExtra("subjectName1", subjectName1.getText().toString().trim());
                        intent.putExtra("subjectName2", subjectName2.getText().toString().trim());
                        intent.putExtra("subjectName3", subjectName3.getText().toString().trim());
                        intent.putExtra("subjectName4", subjectName4.getText().toString().trim());
                        intent.putExtra("score1", score1.getText().toString().trim());
                        intent.putExtra("score2", score2.getText().toString().trim());
                        intent.putExtra("score3", score3.getText().toString().trim());
                        intent.putExtra("score4", score4.getText().toString().trim());
                        intent.putExtra("credit1", credit1.getText().toString().trim());
                        intent.putExtra("credit2", credit2.getText().toString().trim());
                        intent.putExtra("credit3", credit3.getText().toString().trim());
                        intent.putExtra("credit4", credit4.getText().toString().trim());
                        startActivity(intent);
                        finish();}



                }

            });


    }
}