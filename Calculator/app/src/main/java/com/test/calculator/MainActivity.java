package com.test.calculator;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    private TextView mTextView;
    private Button mBottonOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById((R.id.constraintLayout));
        mTextView = (TextView) findViewById(R.id.textView);
    }

    public void onClickBotton(View view) {
        //mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));

     mConstraintLayout.setBackgroundColor(0xffffc0cb);
    }

    public void onClickBottonRtoD(View view) {
    }

    public void onClickBottonResult(View view) {
    }

    public void onClickBottonOne(View view) {
        mTextView.setText("1");
    }

    public void onClickBottonTwo(View view) {
        mTextView.setText("2");
    }

    public void onClickBottonbuttonDivide(View view) {
    }

    public void onClickBottonPlus(View view) {
    }

    public void onClickBottonFour(View view) {
        mTextView.setText("4");
    }

    public void onClickBottonFive(View view) {
        mTextView.setText("5");
    }

    public void onClickBottonSix(View view) {
        mTextView.setText("6");
    }

    public void onClickBottonMinus(View view) {
    }

    public void onClickBottonSeven(View view) {
        mTextView.setText("7");
    }


    public void onClickBottonEight(View view) {
        mTextView.setText("8");
    }

    public void onClickBottonNine(View view) {
        mTextView.setText("9");
    }

    public void onClickBottonMultiply(View view) {
    }

    public void onClickBottonZero(View view) {
        mTextView.setText("0");
    }

    public void onClickBottonDot(View view) {
    }

    public void onClickBottonPIM(View view) {
    }

    public void onClickBottonDtoR(View view) {
    }

    public void onClickBottonThree(View view) {
        mTextView.setText("3");
    }
}
