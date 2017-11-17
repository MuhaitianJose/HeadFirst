package com.muhaitain.headfirstlibrary.chapter_seventh.duck;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class WildTurkey implements Tuckey {
    private final String TAG = WildTurkey.class.getSimpleName();
    @Override
    public void gobble() {
        Log.d(TAG, "gobble, gobble");
    }

    @Override
    public void fly() {
        Log.d(TAG, "I'm flying a short distance");
    }
}
