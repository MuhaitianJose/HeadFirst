package com.muhaitain.headfirstlibrary.chapter_first;


import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class MallardDuck extends Duck {

    public MallardDuck() {
        TAG = MallardDuck.class.getSimpleName();
        iFlyBehavior = new FlyWithWings();
        iQuackBehavior = new Quack();
    }

    public void display() {
        Log.d(TAG, "I'm a real Mallard Duck");
    }
}
