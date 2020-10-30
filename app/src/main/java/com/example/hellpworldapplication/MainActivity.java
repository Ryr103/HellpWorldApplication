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
import android.widget.Toast;

import java.util.logging.Level;

public class  MainActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private TextView subjectName_1;
    private TextView subjectName_2;
    private TextView subjectName_3;
    private TextView subjectName_4;
    private TextView score_1;
    private TextView score_2;
    private TextView score_3;
    private TextView score_4;
    private TextView total_credit;
    private TextView aver_grade;
    private TextView Level1;
    private TextView Level2;
    private TextView Level3;
    private TextView Level4;
    private TextView grade_point1;
    private TextView grade_point2;
    private TextView grade_point3;
    private TextView grade_point4;
    private TextView total_grade_point;
    private TextView comprehensive_rating;
    private TextView _stability;
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
        score_1=findViewById(R.id.score1);
        score_2=findViewById(R.id.score2);
        score_3=findViewById(R.id.score3);
        score_4=findViewById(R.id.score4);
        Level1=findViewById(R.id.level1);
        Level2=findViewById(R.id.level2);
        Level3=findViewById(R.id.level3);
        Level4=findViewById(R.id.level4);
        grade_point1=findViewById(R.id.gradePoint1);
        grade_point2=findViewById(R.id.gradePoint2);
        grade_point3=findViewById(R.id.gradePoint3);
        grade_point4=findViewById(R.id.gradePoint4);
        total_grade_point=findViewById(R.id.totalGradePoint);
        total_credit=findViewById(R.id.totalcredit);
        aver_grade=findViewById(R.id.averGrade);
        _stability=findViewById(R.id.stability);
        comprehensive_rating=findViewById(R.id.comprehensiveRating);
        ImageButton button1=(ImageButton)findViewById(R.id.backToInput);
        Intent intent=getIntent();
        String subjectName1=intent.getStringExtra("subjectName1");
        subjectName_1.setText(subjectName1);
        String subjectName2=intent.getStringExtra("subjectName2");
        subjectName_2.setText(subjectName2);
        String subjectName3=intent.getStringExtra("subjectName3");
        subjectName_3.setText(subjectName3);
        String subjectName4=intent.getStringExtra("subjectName4");
        subjectName_4.setText(subjectName4);
        String score1=intent.getStringExtra("score1");
        score_1.setText(score1);
        String score2=intent.getStringExtra("score2");
        score_2.setText(score2);
        String score3=intent.getStringExtra("score3");
        score_3.setText(score3);
        String score4=intent.getStringExtra("score4");
        score_4.setText(score4);
        String credit1=intent.getStringExtra("credit1");
        String credit2=intent.getStringExtra("credit2");
        String credit3=intent.getStringExtra("credit3");
        String credit4=intent.getStringExtra("credit4");

        Float totalcredit=Float.valueOf(credit1)+Float.valueOf(credit2)+Float.valueOf(credit3)+Float.valueOf(credit4);
        total_credit.setText(totalcredit.toString());
        Float averGrade=((Float.valueOf(score1)*Float.valueOf(credit1)+Float.valueOf(score2)*Float.valueOf(credit2)+Float.valueOf(score3)*Float.valueOf(credit3)+Float.valueOf(score4)*Float.valueOf(credit4))/totalcredit);
        aver_grade.setText(averGrade.toString());
        Float variance=((Float.valueOf(score1)-averGrade)*(Float.valueOf(score1)-averGrade)+(Float.valueOf(score2)-averGrade)*(Float.valueOf(score2)-averGrade)+(Float.valueOf(score3)-averGrade)*(Float.valueOf(score3)-averGrade)+(Float.valueOf(score4)-averGrade)*(Float.valueOf(score4)-averGrade))/4;
        String stability=null;
        if(variance>=0 && variance<=0.99)
        {
            stability="优秀";
        }
        if(variance>0.99 && variance<=3.99)
        {
            stability="良好";
        }
        if(variance>3.99 && variance<=9.99)
        {
            stability="较差";
        }
        if(variance>=10 )
        {
            stability="差";
        }
        _stability.setText(stability);
        String comprehensiveRating=null;
        if(averGrade>=90 && averGrade<=100)
        {
            comprehensiveRating="优秀";
        }
        if(averGrade>=85 && averGrade<90)
        {
            comprehensiveRating="良好";
        }
        if(averGrade>=75 && averGrade<85)
        {
            comprehensiveRating="一般";
        }
        if(averGrade>=60 && averGrade<75)
        {
            comprehensiveRating="较差";
        }
        if(averGrade>=0 && averGrade<60)
        {
            comprehensiveRating="不合格";
        }
        comprehensive_rating.setText(comprehensiveRating);
        String level1="No level";
        Float gradePoint1 = null;
        if (Float.valueOf(score1)>=90 && Float.valueOf(score1)<=100)
        {
            level1="A";gradePoint1=4.0f;
        }
        if (Float.valueOf(score1)>=86 && Float.valueOf(score1)<90)
        {
            level1="A-";gradePoint1=3.7f;
        }
        if (Float.valueOf(score1)>=83 && Float.valueOf(score1)<86)
        {
            level1="B+";gradePoint1=3.3f;
        }
        if (Float.valueOf(score1)>=80 && Float.valueOf(score1)<83)
        {
            level1="B";gradePoint1=3.0f;
        }
        if (Float.valueOf(score1)>=76 && Float.valueOf(score1)<80)
        {
            level1="B-";gradePoint1=2.7f;
        }
        if (Float.valueOf(score1)>=73 && Float.valueOf(score1)<76)
        {
            level1="C+";gradePoint1=2.3f;
        }
        if (Float.valueOf(score1)>=70 && Float.valueOf(score1)<73)
        {
            level1="C";gradePoint1=2.0f;
        }
        if (Float.valueOf(score1)>=66 && Float.valueOf(score1)<70)
        {
            level1="C-";gradePoint1=1.7f;
        }
        if (Float.valueOf(score1)>=63 && Float.valueOf(score1)<66)
        {
            level1="D+";gradePoint1=1.3f;
        }
        if (Float.valueOf(score1)>=60 && Float.valueOf(score1)<63)
        {
            level1="D";gradePoint1=1.0f;
        }
        if (Float.valueOf(score1)>=0 && Float.valueOf(score1)<60)
        {
            level1="F";gradePoint1=0f;
        }
        Level1.setText(level1);
        grade_point1.setText(gradePoint1.toString());
        String level2="No level";
        Float gradePoint2=null;
        if (Float.valueOf(score2)>=90 && Float.valueOf(score2)<=100)
        {
            level2="A";gradePoint2=4.0f;
        }
        if (Float.valueOf(score2)>=86 && Float.valueOf(score2)<90)
        {
            level2="A-";gradePoint2=3.7f;
        }
        if (Float.valueOf(score2)>=83 && Float.valueOf(score2)<86)
        {
            level2="B+";gradePoint2=3.3f;
        }
        if (Float.valueOf(score2)>=80 && Float.valueOf(score2)<83)
        {
            level2="B";gradePoint2=3.0f;
        }
        if (Float.valueOf(score2)>=76 && Float.valueOf(score2)<80)
        {
            level2="B-";gradePoint2=2.7f;
        }
        if (Float.valueOf(score2)>=73 && Float.valueOf(score2)<76)
        {
            level2="C+";gradePoint2=2.3f;
        }
        if (Float.valueOf(score2)>=70 && Float.valueOf(score2)<73)
        {
            level2="C";gradePoint2=2.0f;
        }
        if (Float.valueOf(score2)>=66 && Float.valueOf(score2)<70)
        {
            level2="C-";gradePoint2=1.7f;
        }
        if (Float.valueOf(score2)>=63 && Float.valueOf(score2)<66)
        {
            level2="D+";gradePoint2=1.3f;
        }
        if (Float.valueOf(score2)>=60 && Float.valueOf(score2)<63)
        {
            level2="D";gradePoint2=1.0f;
        }
        if (Float.valueOf(score2)>=0 && Float.valueOf(score2)<60)
        {
            level2="F";gradePoint2=0f;
        }
        Level2.setText(level2);
        grade_point2.setText(gradePoint2.toString());
        String level3="No level";
        Float gradePoint3=null;
        if (Float.valueOf(score3)>=90 && Float.valueOf(score3)<=100)
        {
            level3="A";gradePoint3=4.0f;
        }
        if (Float.valueOf(score3)>=86 && Float.valueOf(score3)<90)
        {
            level3="A-";gradePoint3=3.7f;
        }
        if (Float.valueOf(score3)>=83 && Float.valueOf(score3)<86)
        {
            level3="B+";gradePoint3=3.3f;
        }
        if (Float.valueOf(score3)>=80 && Float.valueOf(score3)<83)
        {
            level3="B";gradePoint3=3.0f;
        }
        if (Float.valueOf(score3)>=76 && Float.valueOf(score3)<80)
        {
            level3="B-";gradePoint3=2.7f;
        }
        if (Float.valueOf(score3)>=73 && Float.valueOf(score3)<76)
        {
            level3="C+";gradePoint3=2.3f;
        }
        if (Float.valueOf(score3)>=70 && Float.valueOf(score3)<73)
        {
            level3="C";gradePoint3=2.0f;
        }
        if (Float.valueOf(score3)>=66 && Float.valueOf(score3)<70)
        {
            level3="C-";gradePoint3=1.7f;
        }
        if (Float.valueOf(score3)>=63 && Float.valueOf(score3)<66)
        {
            level3="D+";gradePoint3=1.3f;
        }
        if (Float.valueOf(score3)>=60 && Float.valueOf(score3)<63)
        {
            level3="D";gradePoint3=1.0f;
        }
        if (Float.valueOf(score3)>=0 && Float.valueOf(score3)<60)
        {
            level3="F";gradePoint3=0f;
        }
        Level3.setText(level3);
        grade_point3.setText(gradePoint3.toString());
        String level4="No level";
        Float gradePoint4=null;
        if (Float.valueOf(score4)>=90 && Float.valueOf(score4)<=100)
        {
            level4="A";gradePoint4=4.0f;
        }
        if (Float.valueOf(score4)>=86 && Float.valueOf(score4)<90)
        {
            level4="A-";gradePoint4=3.7f;
        }
        if (Float.valueOf(score4)>=83 && Float.valueOf(score4)<86)
        {
            level4="B+";gradePoint4=3.3f;
        }
        if (Float.valueOf(score4)>=80 && Float.valueOf(score4)<83)
        {
            level4="B";gradePoint4=3.0f;
        }
        if (Float.valueOf(score4)>=76 && Float.valueOf(score4)<80)
        {
            level4="B-";gradePoint4=2.7f;
        }
        if (Float.valueOf(score4)>=73 && Float.valueOf(score4)<76)
        {
            level4="C+";gradePoint4=2.3f;
        }
        if (Float.valueOf(score4)>=70 && Float.valueOf(score4)<73)
        {
            level4="C";gradePoint4=2.0f;
        }
        if (Float.valueOf(score4)>=66 && Float.valueOf(score4)<70)
        {
            level4="C-";gradePoint4=1.7f;
        }
        if (Float.valueOf(score4)>=63 && Float.valueOf(score4)<66)
        {
            level4="D+";gradePoint4=1.3f;
        }
        if (Float.valueOf(score4)>=60 && Float.valueOf(score4)<63)
        {
            level4="D";gradePoint4=1.0f;
        }
        if (Float.valueOf(score4)>=0 && Float.valueOf(score4)<60)
        {
            level4="F";gradePoint4=0f;
        }
        Level4.setText(level4);
        grade_point4.setText(gradePoint4.toString());
        Float totalGradePoint=(gradePoint1*Float.valueOf(credit1)+gradePoint2*Float.valueOf(credit2)+gradePoint3*Float.valueOf(credit3)+gradePoint4*Float.valueOf(credit4))/totalcredit;
        total_grade_point.setText(totalGradePoint.toString());
        ImageButton button2=(ImageButton)findViewById(R.id.goToReport);
        String finalComprehensiveRating = comprehensiveRating;
        String finalStability = stability;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityInputYourScore.class);
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

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
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





        Log.d("HellpWorldActivity", "onCreate execute");
    }
}