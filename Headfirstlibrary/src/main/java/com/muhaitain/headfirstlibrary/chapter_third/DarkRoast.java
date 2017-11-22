package com.muhaitain.headfirstlibrary.chapter_third;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast CoffeeWithHook";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
