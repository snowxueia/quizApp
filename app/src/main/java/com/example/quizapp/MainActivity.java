package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.lang.annotation.Documented;


public class MainActivity extends AppCompatActivity {

    //private int radioQuestionOneGroup;
       RadioButton a1,b1,c1,d1;

       Button submit;

       CheckBox a2,b2,c2,d2;

    RadioButton a3,b3,c3,d3;
    RadioButton a4,b4,c4,d4;

 //   private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (RadioButton) findViewById(R.id.a1);
        b1 = (RadioButton) findViewById(R.id.b1);
        c1 = (RadioButton) findViewById(R.id.c1);
        d1 = (RadioButton) findViewById(R.id.d1);

        a2 = (CheckBox) findViewById(R.id.a2);
        b2 = (CheckBox) findViewById(R.id.b2);
        c2 = (CheckBox) findViewById(R.id.c2);
        d2 = (CheckBox) findViewById(R.id.d2);

        a3 = (RadioButton) findViewById(R.id.a3);
        b3 = (RadioButton) findViewById(R.id.b3);
        c3 = (RadioButton) findViewById(R.id.c3);
        d3 = (RadioButton) findViewById(R.id.d3);

        a4 = (RadioButton) findViewById(R.id.a4);
        b4 = (RadioButton) findViewById(R.id.b4);
        c4 = (RadioButton) findViewById(R.id.c4);
        d4 = (RadioButton) findViewById(R.id.d4);


        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int score = 0;

                if (a1.isChecked()) {
                    score += 25;
                } else if (b1.isChecked()) {
                    score += 0;
                } else if (c1.isChecked()) {
                    score += 0;
                } else if (d1.isChecked()) {
                    score += 0;
                }

                if ((a2.isChecked()) && (b2.isChecked()) && (c2.isChecked())) {
                    score += 25;
                } else {
                    score += 0;
                }

                if (a3.isChecked()) {
                    score += 25;
                } else if (b3.isChecked()) {
                    score += 0;
                } else if (c3.isChecked()) {
                    score += 0;
                } else if (d3.isChecked()) {
                    score += 0;
                }

                if (a4.isChecked()) {
                    score += 25;
                } else if (b4.isChecked()) {
                    score += 0;
                } else if (c4.isChecked()) {
                    score += 0;
                } else if (d4.isChecked()) {
                    score += 0;
                }

                Toast.makeText(getApplicationContext(), score, Toast.LENGTH_LONG).show();


            }
        });
    }



    }





}
