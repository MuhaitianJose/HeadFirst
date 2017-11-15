package com.muhaitain.headfirstlibrary.chapter_third;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
