package com.example.addnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button Add_button;
    Button Sub_button;
    Button Mul_button;
    Button Div_button;
    Button Clr_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1= findViewById(R.id.editText_first_no);
        number2= findViewById(R.id.editText_second_no);
        Add_button= findViewById(R.id.add_button);
        Sub_button= findViewById(R.id.sub_button);
        Mul_button= findViewById(R.id.mul_button);
        Div_button= findViewById(R.id.div_button);
        Clr_button= findViewById(R.id.clr_button);
        result= findViewById(R.id.textView_answer);
        Add_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                double num1=Double.parseDouble(number1.getText().toString());
                double num2=Double.parseDouble(number2.getText().toString());
                double sum=num1+num2;
                result.setText(Double.toString(sum));
            }
        });
        Sub_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                double num1=Double.parseDouble(number1.getText().toString());
                double num2=Double.parseDouble(number2.getText().toString());
                double sum=num2-num1;
                result.setText(Double.toString(sum));
            }
        });
        Mul_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                double num1=Double.parseDouble(number1.getText().toString());
                double num2=Double.parseDouble(number2.getText().toString());
                double sum=num1*num2;
                result.setText(Double.toString(sum));
            }
        });
        Div_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                double num1=Double.parseDouble(number1.getText().toString());
                double num2=Double.parseDouble(number2.getText().toString());
                double sum=num2/num1;
                result.setText(Double.toString(sum));
            }
        });
        Clr_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                number1.getText().clear();
                number2.getText().clear();
                result.setText("");
            }
        });
    }
}