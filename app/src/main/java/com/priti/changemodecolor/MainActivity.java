package com.priti.changemodecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        radioGroup = findViewById(R.id.Radio);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {

               switch (checked){
                   case R.id.btnblue:
                       layout.setBackgroundColor(Color.parseColor("#FF3700B3"));
                       break;
                   case R.id.btnyellow:
                       layout.setBackgroundColor(Color.parseColor("#FF03DAC5"));
                       break;
                   case R.id.btnred:
                       layout.setBackgroundColor(Color.parseColor("#FF000000"));
                       break;
               }
            }
        });
    }
}