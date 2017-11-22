package com.muhaitain.headfirstlibrary.chapter_ninth.component;

import android.util.Log;

import java.util.Iterator;

/**
 * Created by Muhaitian on 2017/11/21.
 */

public class MenuItem extends MenuComponent{
    private final String TAG = MenuItem.class.getSimpleName();
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


    @Override
    public Iterator createIterator() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return descriptiom;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        Log.d(TAG, "print: "+getName());
        Log.d(TAG, "print: "+isVegetarian());
        Log.d(TAG, "print: "+getPrice());
        Log.d(TAG, "print: "+getDescription());
    }
}
