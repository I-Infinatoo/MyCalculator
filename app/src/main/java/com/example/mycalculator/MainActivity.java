package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etnum1 , etnum2 ;
    Button btnAdd , btnSubt , btnMulti , btnDivide ;
    TextView tvResults ;
    DecimalFormat formater ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubt = findViewById(R.id.btnSubt);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        tvResults = findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);
        formater = new DecimalFormat("####0.00");

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           if (etnum1.getText().toString().isEmpty() ||
                 etnum2.getText().toString().isEmpty()) {

               Toast.makeText(MainActivity.this, "Please enter both numbers to calculate!", Toast.LENGTH_SHORT).show();
           }
           else{
                    Double num1 = Double.parseDouble(etnum1.getText().toString().trim());
                    Double num2 = Double.parseDouble(etnum2.getText().toString().trim());

                    Double res = num1 + num2;
                    String show = num1 + " + " + num2 + " = " + formater.format(res);
                    tvResults.setText(show);

                    tvResults.setVisibility(View.VISIBLE);
           }
            }
        });

        btnSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etnum1.getText().toString().isEmpty() ||
                        etnum2.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Please enter both numbers to calculate!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double num1 = Double.parseDouble(etnum1.getText().toString().trim());
                    Double num2 = Double.parseDouble(etnum2.getText().toString().trim());

                    Double res = num1 - num2;
                    String show = num1 + " - " + num2 + " = " + formater.format(res);
                    tvResults.setText(show);

                    tvResults.setVisibility(View.VISIBLE);
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etnum1.getText().toString().isEmpty() ||
                        etnum2.getText().toString().isEmpty()) {

                    Toast.makeText(MainActivity.this, "Please enter both numbers to calculate!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Double num1 = Double.parseDouble(etnum1.getText().toString().trim());
                    Double num2 = Double.parseDouble(etnum2.getText().toString().trim());

                    Double res = num1 * num2;
                    String show = num1 + " x " + num2 + " = " + formater.format(res);
                    tvResults.setText(show);

                    tvResults.setVisibility(View.VISIBLE);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if ( etnum2.getText().toString().isEmpty() ||
                  etnum1.getText().toString().isEmpty() )  {

                Toast.makeText(MainActivity.this, "Please enter both numbers to calculate!", Toast.LENGTH_SHORT).show();
            }

            else {

                Double num1 = Double.parseDouble(etnum1.getText().toString().trim());
                Double num2 = Double.parseDouble(etnum2.getText().toString().trim());

                if (num2 == 0)
                    Toast.makeText(MainActivity.this, "Cannot Divide by 0 ", Toast.LENGTH_SHORT).show();

                else {

                    Double res = num1 / num2;
                    String show = num1 + " / " + num2 + " = " + formater.format(res);
                    tvResults.setText(show);

                    tvResults.setVisibility(View.VISIBLE);
                }
            }

            }
        });
    }
}