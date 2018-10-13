package com.example.luis.myandroidapplicationone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;


public class SelectActivity extends AppCompatActivity {

    Activity context;

    Integer  noteSen = 0;
    Integer  noteCos = 0;
    Integer  noteTan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        context = this;

        RadioGroup radioGroupSen = (RadioGroup) findViewById(R.id.radioGroupSen);
        RadioGroup radioGroupCos = (RadioGroup) findViewById(R.id.radioGroupCos);
        RadioGroup radioGroupTan = (RadioGroup) findViewById(R.id.radioGroupTan);
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

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShowResult = new Intent(context, ResultActivity.class);
                intentShowResult.putExtra("noteSen", noteSen);
                intentShowResult.putExtra("noteCos",  noteCos);
                intentShowResult.putExtra("noteTan",  noteTan);
                startActivity(intentShowResult);
            }
        });
    }
}
