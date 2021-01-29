package com.example.testcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numOne,numTwo,result;
    TextView equal,operand;
    Button plus,minus,mul,div,mod,pow;
    int num1,num2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOne = findViewById(R.id.numOne);
        numTwo = findViewById(R.id.numTwo);
        equal = findViewById(R.id.equals);
        result = findViewById(R.id.result);
        operand = findViewById(R.id.operand);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mul = findViewById(R.id.product);
        div = findViewById(R.id.divide);
        mod = findViewById(R.id.mod);
        pow = findViewById(R.id.power);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNumbers()){
                    operand.setText("+");
                    res = num1 + num2;
                    result.setText(Integer.toString(res));
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNumbers()){
                    operand.setText("-");
                    res = num1 - num2;
                    result.setText(Integer.toString(res));
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNumbers()){
                    operand.setText("*");
                    res = num1 * num2;
                    result.setText(Integer.toString(res));
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNumbers()){
                    operand.setText("/");
                    Double ans = Double.valueOf(num1 / num2);
                    result.setText(Double.toString(ans));
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNumbers()){
                    operand.setText("%");
                    res = num1 % num2;
                    result.setText(Integer.toString(res));
                }
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getNumbers()){
                    operand.setText("^");
                    Double power = Math.pow(num1,num2);
                    result.setText(Double.toString(power));
                }
            }
        });

    }

    private boolean getNumbers() {
        String n1,n2;
        n1 =numOne.getText().toString();
        n2 = numTwo.getText().toString();
        if(n1.equals(null) && n2.equals(null) || n1.equals("") && n2.equals("")){
            Toast.makeText(getApplicationContext(),"Enter Num1 & Num2",Toast.LENGTH_SHORT).show();
            return false;
        }
        else {
            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
        }
        return true;
    }


}