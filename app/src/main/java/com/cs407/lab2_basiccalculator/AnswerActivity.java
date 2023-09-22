package com.cs407.lab2_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_activity);
        textView = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("solution");
        textView.setText(str);
    }

}