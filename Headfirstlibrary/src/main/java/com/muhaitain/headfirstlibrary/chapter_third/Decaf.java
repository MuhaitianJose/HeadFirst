package com.muhaitain.headfirstlibrary.chapter_third;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
