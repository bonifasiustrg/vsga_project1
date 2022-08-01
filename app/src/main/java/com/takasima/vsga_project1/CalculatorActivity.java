package com.takasima.vsga_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        getSupportActionBar().setTitle("Aplikasi Kalkulator");
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        Button btnPlus = findViewById(R.id.btn_plus);
        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnMultiply = findViewById(R.id.btn_multiply);
        Button btnDiv = findViewById(R.id.btn_division);
        Button btnClear = findViewById(R.id.btn_clear);
        TextView tvResult = findViewById(R.id.tvResult);

        // addition operation
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length()>0 && number2.getText().toString().length()>0) {
                    // get the number variable
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    //calculate
                    double result = num1 + num2;

                    tvResult.setText("Hasil perhitungan\n"+result);
                }

            }
        });

        // addition operation
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length()>0 && number2.getText().toString().length()>0){
                    // get the number variable
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    //calculate
                    double result = num1 - num2;

                    tvResult.setText("Hasil perhitungan\n" + result);
                }
            }
        });

        // multiply operation
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length()>0 && number2.getText().toString().length()>0){
                    // get the number variable
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    //calculate
                    double result = num1 * num2;

                    tvResult.setText("Hasil perhitungan\n" + result);
                }
            }
        });

        // division operation
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length()>0 && number2.getText().toString().length()>0){
                    // get the number variable
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    //calculate
                    double result = num1 / num2;

                    tvResult.setText("Hasil perhitungan\n" + result);
                }
            }
        });

        // clear
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number1.getText().toString().length()>0 && number2.getText().toString().length()>0){
                    // get the number variable
                    number1.setText("");
                    number2.setText("");
                    tvResult.setText("");
                }
            }
        });
    }
}