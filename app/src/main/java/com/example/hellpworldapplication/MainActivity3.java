package com.example.hellpworldapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
  private ImageButton button;
  private TextView report;
  private TextView report_body;
  private TextView aver_grade;
  private TextView advantageSubject;
  private TextView disadvantageSubject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main3);
        report=findViewById(R.id.report);
        report_body=findViewById(R.id.report_body);
        advantageSubject=findViewById(R.id.advantage_subject);
        disadvantageSubject=findViewById(R.id.Disadvantage_subject);
        Intent intent=getIntent();
        String level=intent.getStringExtra("level");
        String subjectName1=intent.getStringExtra("subjectName1");
        String subjectName2=intent.getStringExtra("subjectName2");
        String subjectName3=intent.getStringExtra("subjectName3");
        String subjectName4=intent.getStringExtra("subjectName4");
        String score1=intent.getStringExtra("score1");
        String score2=intent.getStringExtra("score2");
        String score3=intent.getStringExtra("score3");
        String score4=intent.getStringExtra("score4");
        String credit1=intent.getStringExtra("credit1");
        String credit2=intent.getStringExtra("credit2");
        String credit3=intent.getStringExtra("credit3");
        String credit4=intent.getStringExtra("credit4");

        Float averGrade=((Float.valueOf(score1)*Float.valueOf(credit1)+Float.valueOf(score2)*Float.valueOf(credit2)+Float.valueOf(score3)*Float.valueOf(credit3)+Float.valueOf(score4)*Float.valueOf(credit4))/(Float.valueOf(credit1)+Float.valueOf(credit2)+Float.valueOf(credit3)+Float.valueOf(credit4)));
        Float variance=((Float.valueOf(score1)-averGrade)*(Float.valueOf(score1)-averGrade)+(Float.valueOf(score2)-averGrade)*(Float.valueOf(score2)-averGrade)+(Float.valueOf(score3)-averGrade)*(Float.valueOf(score3)-averGrade)+(Float.valueOf(score4)-averGrade)*(Float.valueOf(score4)-averGrade))/4;
        String stability=null;
        String reportBody=null;
        if(variance>=0f && variance<=0.99f)
        {
            stability="优秀";reportBody="成绩优秀，无偏科现象";
        }
        if(variance>0.99f && variance<=9.99f)
        {
            stability="良好";reportBody="成绩良好，存在偏科现象";
        }
        if(variance>=10f )
        {
            stability="差";reportBody="成绩不稳定，偏科较严重";
        }
        report.setText(stability);
        report_body.setText(reportBody);
        if(Float.valueOf(score1)>Float.valueOf(score2) && Float.valueOf(score1)>Float.valueOf(score3) && Float.valueOf(score1)>Float.valueOf(score4))
        {
            advantageSubject.setText(subjectName1);
        }
        if(Float.valueOf(score2)>Float.valueOf(score1) && Float.valueOf(score2)>Float.valueOf(score3) && Float.valueOf(score1)>Float.valueOf(score4))
        {
            advantageSubject.setText(subjectName2);
        }
        if(Float.valueOf(score3)>Float.valueOf(score1) && Float.valueOf(score3)>Float.valueOf(score2) && Float.valueOf(score3)>Float.valueOf(score4))
        {
            advantageSubject.setText(subjectName3);
        }
        if(Float.valueOf(score4)>Float.valueOf(score1) && Float.valueOf(score4)>Float.valueOf(score2) && Float.valueOf(score4)>Float.valueOf(score3))
        {
            advantageSubject.setText(subjectName4);
        }
        if(Float.valueOf(score1)<Float.valueOf(score2) && Float.valueOf(score1)<Float.valueOf(score3) && Float.valueOf(score1)<Float.valueOf(score4))
        {
            disadvantageSubject.setText(subjectName1);
        }
        if(Float.valueOf(score2)<Float.valueOf(score1) && Float.valueOf(score2)<Float.valueOf(score3) && Float.valueOf(score1)<Float.valueOf(score4))
        {
            disadvantageSubject.setText(subjectName2);
        }
        if(Float.valueOf(score3)<Float.valueOf(score1) && Float.valueOf(score3)<Float.valueOf(score2) && Float.valueOf(score3)<Float.valueOf(score4))
        {
            disadvantageSubject.setText(subjectName3);
        }
        if(Float.valueOf(score4)<Float.valueOf(score1) && Float.valueOf(score4)<Float.valueOf(score2) && Float.valueOf(score4)<Float.valueOf(score3))
        {
            disadvantageSubject.setText(subjectName4);
        }

        button=findViewById(R.id.backToAssessment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                intent.putExtra("subjectName1", subjectName1);
                intent.putExtra("subjectName2", subjectName2);
                intent.putExtra("subjectName3", subjectName3);
                intent.putExtra("subjectName4", subjectName4);
                intent.putExtra("score1",score1);
                intent.putExtra("score2",score2);
                intent.putExtra("score3",score3);
                intent.putExtra("score4",score4);
                intent.putExtra("credit1",credit1);
                intent.putExtra("credit2",credit2);
                intent.putExtra("credit3",credit3);
                intent.putExtra("credit4",credit4);
                startActivity(intent);
                finish();
            }
        });
    }
}