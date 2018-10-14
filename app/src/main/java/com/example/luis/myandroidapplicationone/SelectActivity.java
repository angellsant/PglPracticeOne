package com.example.luis.myandroidapplicationone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;


public class SelectActivity extends AppCompatActivity {

    Activity context;

    Integer noteSen, noteCos, noteTan;
    Double noteCheckSen, noteCheckCos, noteCheckTan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        context = this;

        noteSen = 0;
        noteCos = 1;
        noteTan = 1;
        noteCheckSen = 0.0;
        noteCheckCos = 0.0;
        noteCheckTan = 1.3;

        RadioGroup radioGroupSen = (RadioGroup) findViewById(R.id.radioGroupSen);
        RadioGroup radioGroupCos = (RadioGroup) findViewById(R.id.radioGroupCos);
        RadioGroup radioGroupTan = (RadioGroup) findViewById(R.id.radioGroupTan);
        final CheckBox checkBoxSen, checkBoxCos, checkBoxTan;
        checkBoxSen = (CheckBox) findViewById(R.id.checkBoxSen30);
        checkBoxCos = (CheckBox) findViewById(R.id.checkBoxCos60);
        checkBoxTan = (CheckBox) findViewById(R.id.checkBoxTan90);
        Button buttonResult = (Button) findViewById(R.id.buttonShowResult);

        radioGroupSen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButtonSen0:
                            noteSen = 0;
                        break;
                    case R.id.radioButtonSen1:
                            noteSen = 1;
                        break;
                }

            }
        });

        radioGroupCos.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButtonCos0:
                            noteCos = 1;
                        break;
                    case R.id.radioButtonCos1:
                            noteCos = 0;
                        break;
                }
            }
        });

        radioGroupTan.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButtonTan0:
                            noteTan = 1;
                        break;
                    case R.id.radioButtonTan1:
                            noteTan = 0;
                        break;
                }
            }
        });

        checkBoxSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noteCheckSen = (checkBoxSen.isChecked()) ? 1.333 : 0.0;
            }
        });

        checkBoxCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noteCheckCos = (checkBoxCos.isChecked()) ? 1.333 : 0.0;
            }
        });

        checkBoxTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noteCheckTan = (checkBoxTan.isChecked()) ? 0.0 : 1.333;
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer noteEndOne, noteEndTwo;

                noteEndOne = (noteSen+noteCos+noteTan)*2;
                noteEndTwo = (int)Math.round((noteCheckSen+noteCheckCos+noteCheckTan));

                Intent intentShowResult = new Intent(context, ResultActivity.class);
                intentShowResult.putExtra("noteQuestionOne",noteEndOne);
                intentShowResult.putExtra("noteQuestionTwo",noteEndTwo);
                startActivity(intentShowResult);

            }
        });
    }
}
