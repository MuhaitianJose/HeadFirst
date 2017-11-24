package com.muhaitain.headfirstlibrary.chapter_twelfth.model;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public class RedheadDuck implements Quackable {
    private final String TAG = RedheadDuck.class.getSimpleName();

    @Override
    public void quack() {
        Log.d(TAG, "Quack");
    }
}
