package com.example.homework331;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editExpression;

    TextView one;
    TextView two;
    TextView tree;
    TextView four;
    TextView five;
    TextView six;
    TextView seven;
    TextView eight;
    TextView nine;
    TextView zero;
    TextView plus;
    TextView minus;
    TextView multiply; //умножение
    TextView divide; //деление
    TextView clear;
    TextView changeSign;
    TextView proc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
