package com.muhaitain.headfirstlibrary.chapter_third;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
