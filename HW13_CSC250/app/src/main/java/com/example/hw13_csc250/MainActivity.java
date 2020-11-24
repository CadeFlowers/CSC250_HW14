package com.example.hw13_csc250;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }
    public void onButtonClicked(View v)
    {
        TextView myTextView = this.findViewByID(R.id.myTextView);
        myTextView.setText("Cade");
    }


    public void onButton2Clicked(View v)
    {
        TextView myTextViewTwo = this.findViewById(R.id.myTextViewTwo);
        myTextViewTwo.setText("Flowers");
    }
}