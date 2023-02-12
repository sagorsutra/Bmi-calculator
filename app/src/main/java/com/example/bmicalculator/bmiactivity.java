package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class bmiactivity extends AppCompatActivity {
    Button recalculate;
    TextView showbmi,gender,category;
    ImageView sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        recalculate = findViewById(R.id.recalculatebmi);
        showbmi = findViewById(R.id.Bmi);
        gender = findViewById(R.id.displaygender);
        category = findViewById(R.id.category);
        sign = findViewById(R.id.response);

        Intent intent;

        String  Gender = getIntent().getStringExtra("Gender");     //receiving data of another window
        String  weight = getIntent().getStringExtra("weight");
        String  age = getIntent().getStringExtra("age");
        String  height = getIntent().getStringExtra("height");

        float rweight = Float.parseFloat(weight);
        float rheight = Float.parseFloat(height);
        float n;

        float Mheight = rheight/100;

        float ans = rweight/(Mheight*Mheight);

        String answer = String.valueOf(ans);
        showbmi.setText(answer);    //These two this will be fixed that's why they're not in the loop
        gender.setText(Gender);

        /*
        If your BMI is less than 18.5, it falls within the underweight range.
        If your BMI is 18.5 to <25, it falls within the healthy weight range.
        If your BMI is 25.0 to <30, it falls within the overweight range.
        If your BMI is 30.0 or higher, it falls within the obesity range.

         */

        if (ans<18.5)
        {
            category.setText("You're underweight");
            sign.setImageResource(R.drawable.crosss);
        }
        else if (ans>18.5 && ans<25)
        {
            category.setText("You're in healthy weight range");
            sign.setImageResource(R.drawable.ok);
        }
        else if (ans >25.0 && ans<30)
        {
            category.setText("you're in over weight");
            sign.setImageResource(R.drawable.crosss);
        }
        else
        {
            category.setText("You are in obesity range");
            sign.setImageResource(R.drawable.warning);
        }



        recalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bmiactivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }



}