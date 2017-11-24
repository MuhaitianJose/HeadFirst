package com.muhaitain.headfirstlibrary.chapter_twelfth.model;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public class MallardDuck implements Quackable {
    private final String TAG = MallardDuck.class.getSimpleName();

    @Override
    public void quack() {
        Log.d(TAG, "Quack");
    }
}