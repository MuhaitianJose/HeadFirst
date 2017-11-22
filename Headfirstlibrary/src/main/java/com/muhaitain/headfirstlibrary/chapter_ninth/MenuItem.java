package com.muhaitain.headfirstlibrary.chapter_ninth;

/**
 * Created by Muhaitian on 2017/11/20.
 */

public class MenuItem {
    String name;
    String descriptiom;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String descriptiom, boolean vegetarian, double price) {
        this.name = name;
        this.descriptiom = descriptiom;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescriptiom() {
        return descriptiom;
    }

    public double getPrice() {
        return price;
    }
}
