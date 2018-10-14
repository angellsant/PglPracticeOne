package com.example.luis.myandroidapplicationone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    //  Integer endNote = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Intent intentResult = this.getIntent();
        Integer noteForQuestionOne = intentResult.getExtras().getInt("noteQuestionOne");
        Integer noteForQuestionTwo = intentResult.getExtras().getInt("noteQuestionTwo");

        Integer endNote = noteForQuestionOne+noteForQuestionTwo;

        String finalText = "Resultado: " + endNote.toString();

        TextView textViewResult = (TextView) findViewById(R.id.textViewFinalResult);
        textViewResult.setText(finalText);

    }

}
