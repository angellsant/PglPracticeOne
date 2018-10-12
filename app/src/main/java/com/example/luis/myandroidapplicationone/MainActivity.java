package com.example.luis.myandroidapplicationone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        ImageView imgLogoEnter = (ImageView) findViewById(R.id.imageApplicationLogo);
        imgLogoEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSelectActivity = new Intent(context,SelectActivity.class);
                context.startActivity(goToSelectActivity);
            }
        });

    }
}
