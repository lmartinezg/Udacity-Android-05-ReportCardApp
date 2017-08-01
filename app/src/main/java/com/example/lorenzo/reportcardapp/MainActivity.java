package com.example.lorenzo.reportcardapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView fullReport = (TextView) findViewById(R.id.full_report);
        TextView maths = (TextView) findViewById(R.id.maths);
        TextView language = (TextView) findViewById(R.id.language);
        TextView science = (TextView) findViewById(R.id.science);
        TextView health = (TextView) findViewById(R.id.health);
        TextView art = (TextView) findViewById(R.id.art);
        TextView music = (TextView) findViewById(R.id.music);

//        ReportCard myReportCard = new ReportCard();
        ReportCard myReportCard = new ReportCard(70, 65, 80, 75, 90, 83);

        myReportCard.setmMathsGrade(33);
        myReportCard.setmLanguageGrade(44);
        myReportCard.setmScienceGrade(55);
        myReportCard.setmHealthGrade(66);
        myReportCard.setmArtGrade(77);
        myReportCard.setmMusicGrade(88);

        fullReport.setText(myReportCard.toString());
        maths.setText(String.valueOf(myReportCard.getmMathsGrade()));
        language.setText(String.valueOf(myReportCard.getmLanguageGrade()));
        science.setText(String.valueOf(myReportCard.getmScienceGrade()));
        health.setText(String.valueOf(myReportCard.getmHealthGrade()));
        art.setText(String.valueOf(myReportCard.getmArtGrade()));
        music.setText(String.valueOf(myReportCard.getmMusicGrade()));
    }
}
