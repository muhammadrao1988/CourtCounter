package com.example.muhammad.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //add three points for team a
    public void addThreePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }
    //add three points for team B
    public void addThreePointsTeamB(View view){

        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    //add two points for team A
    public void addTwoPointsTeamA(View view){

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    //add two points for team B
    public void addTwoPointsTeamB(View view){

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    //add one point for team A
    public void addFreeThrowTeamA(View view){

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    //add one point for team B
    public void addFreeThrowTeamB(View view){

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    //display team A score
    public void displayForTeamA(int score){
        TextView scoreView =  (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //display team B score
    public void displayForTeamB(int score){
        TextView scoreView =  (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //reset team A and eam B score
    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
