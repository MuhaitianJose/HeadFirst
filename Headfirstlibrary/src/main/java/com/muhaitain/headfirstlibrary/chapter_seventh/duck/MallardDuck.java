package com.muhaitain.headfirstlibrary.chapter_seventh.duck;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class MallardDuck implements Duck {

    private final String TAG = MallardDuck.class.getSimpleName();

    @Override
    public void quack() {
        Log.d(TAG, "quack: Quack");
    }

    @Override
    public void fly() {
        Log.d(TAG, "fly: I'm flying");

    }
}
