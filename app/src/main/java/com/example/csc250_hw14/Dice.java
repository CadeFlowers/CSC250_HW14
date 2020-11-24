package com.example.csc250_hw14;

import java.util.Random;

public class Dice
{
    private int numOfSides;

    public Dice(int numOfSides)
    {
        this.numOfSides = numOfSides;
    }

    public int roll()
    {
        Random r = new Random();
        return r.nextInt(this.numOfSides)+1;
    }
}
