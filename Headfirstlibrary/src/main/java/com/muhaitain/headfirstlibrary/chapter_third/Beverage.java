package com.muhaitain.headfirstlibrary.chapter_third;

/**
 * Created by Muhaitian on 2017/11/15.
 * <p>
 * 饮料基类
 */

public abstract class Beverage {
    protected String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
