package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   Button calculate;
   ImageView incrementwight,decrementwight,incrage,decreage;
   TextView currheight;
   TextView currage,curweight;
   SeekBar seekbarforheight;
   RelativeLayout male,female;


   int age =22;
   int weight =55;
   int height = 170;
   int currprogress;
   String intprogress ="170";
   String typeuser = "0";
   String weight2 = "55";
   String age2 = "22";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calculate = findViewById(R.id.calbutton);
        incrementwight = findViewById(R.id.incremetweight);
        decrementwight = findViewById(R.id.decrementage);
        curweight = findViewById(R.id.currentweight);
        currheight = findViewById(R.id.currentheight);
        currage = findViewById(R.id.currentage);
        incrage = findViewById(R.id.incrementage);
        decreage = findViewById(R.id.decrementage);
        seekbarforheight = findViewById(R.id.seekbarforheight);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);


        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                male.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                female.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeuser = "male";

            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                female.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                male.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeuser = "female";
            }
        });


        seekbarforheight.setMax(300);
        seekbarforheight.setProgress(170);
        seekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                currprogress = i;
                intprogress = String.valueOf(currprogress);
                currheight.setText(intprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,bmiactivity.class);
                startActivity(intent);
                finish();
            }
        });






    }
}