package com.muhaitain.headfirstlibrary.chapter_third;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
