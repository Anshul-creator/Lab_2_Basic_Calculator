package com.cs407.lab2_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunctionAdd(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        goToAddActivity(Integer.parseInt(firstNumber.getText().toString()),
                Integer.parseInt(secondNumber.getText().toString()));
    }

    public void goToAddActivity(int firstNumber, int secondNumber) {
        String solution = String.valueOf(firstNumber + secondNumber);
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("solution", solution);
        startActivity(intent);
    }

    public void clickFunctionSubtract(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        goToSubtractActivity(Integer.parseInt(firstNumber.getText().toString()),
                Integer.parseInt(secondNumber.getText().toString()));
    }

    public void goToSubtractActivity(int firstNumber, int secondNumber) {
        String solution = String.valueOf(firstNumber - secondNumber);
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("solution", solution);
        startActivity(intent);
    }

    public void clickFunctionMultiply(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        goToMultiplyActivity(Integer.parseInt(firstNumber.getText().toString()),
                Integer.parseInt(secondNumber.getText().toString()));
    }

    public void goToMultiplyActivity(int firstNumber, int secondNumber) {
        String solution = String.valueOf(firstNumber * secondNumber);
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("solution", solution);
        startActivity(intent);
    }

    public void clickFunctionDivide(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        goToDivideActivity(Double.parseDouble(firstNumber.getText().toString()),
                Double.parseDouble(secondNumber.getText().toString()));
    }

    public void goToDivideActivity(double firstNumber, double secondNumber) {
        //String solution = String.valueOf(firstNumber / secondNumber);
        double answer;
        String solution;
        try {
            answer = firstNumber / secondNumber;
            solution = String.valueOf(answer);
        }
        catch (ArithmeticException arithmeticException) {
            solution = "Invalid Operation: Divide by zero";
        }
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("solution", solution);
        startActivity(intent);
    }

}