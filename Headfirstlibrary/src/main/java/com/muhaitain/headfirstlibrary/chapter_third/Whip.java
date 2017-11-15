package com.muhaitain.headfirstlibrary.chapter_third;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
