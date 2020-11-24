package com.example.csc250_hw14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button d4_button;
    private Button d6_button;
    private Button d8_button;
    private Button d10_button;
    private Button d12_button;
    private Button d20_button;
    private TextView total_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.d4_button = this.findViewById(R.id.d4_button);
        this.d6_button = this.findViewById(R.id.d6_button);
        this.d8_button = this.findViewById(R.id.d8_button);
        this.d10_button = this.findViewById(R.id.d10_button);
        this.d12_button = this.findViewById(R.id.d12_button);
        this.d20_button = this.findViewById(R.id.d20_button);
        this.total_tv = this.findViewById(R.id.total_tv);
    }
    public void onButtonClicked(View v)
    {
        if(v == this.d4_button)
        {
            Dice d4 = new Dice(4);
            this.total_tv.setText("" + d4.roll());
        }
        else if(v == this.d6_button)
        {
            Dice d6 = new Dice(6);
            this.total_tv.setText("" + d6.roll());
        }
        else if(v == this.d8_button)
        {
            Dice d8 = new Dice(8);
            this.total_tv.setText("" + d8.roll());
        }
        else if(v == this.d10_button)
        {
            Dice d10 = new Dice(10);
            this.total_tv.setText("" + d10.roll());
        }
        else if(v == this.d12_button)
        {
            Dice d12 = new Dice(12);
            this.total_tv.setText("" + d12.roll());
        }
        else if(v == this.d20_button)
        {
            Dice d20 = new Dice(20);
            this.total_tv.setText("" + d20.roll());
        }
    }
}