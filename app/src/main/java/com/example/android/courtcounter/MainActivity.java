package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Score_Team_A = 0;
    int Score_Team_B = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeToTeamA(View view) {
        Score_Team_A += 3;
        displayForTeamA(Score_Team_A);
    }

    public void addTwoToTeamA(View view) {
        Score_Team_A += 2;
        displayForTeamA(Score_Team_A);
    }

    public void addOneToTeamA(View view) {
        Score_Team_A++;
        displayForTeamA(Score_Team_A);
    }

    public void addThreeToTeamB(View view) {
        Score_Team_B += 3;
        displayForTeamB(Score_Team_B);
    }

    public void addTwoToTeamB(View view) {
        Score_Team_B += 2;
        displayForTeamB(Score_Team_B);
    }

    public void addOneToTeamB(View view) {
        Score_Team_B++;
        displayForTeamB(Score_Team_B);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        Score_Team_B=0;
        displayForTeamB(Score_Team_B);
        Score_Team_A=0;
        displayForTeamA(Score_Team_A);
    }

}


