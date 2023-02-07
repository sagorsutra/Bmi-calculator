package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText height, weight;
    Button button;
    TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        int heigt,wight;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value  = height.getText().toString();
                String val = weight.getText().toString();

                float val1 = Float.parseFloat(value);
                float val2 = Float.parseFloat(val);



                float ans = val2/(val1 * val1);

                String finl = Float.toString(ans);


                result.setText(finl);



            }
        });



    }
}