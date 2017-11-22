package com.muhaitain.headfirstlibrary.chapter_eighth;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/20.
 *
 */

public class CoffeeWithHook extends CaffeIneBeverageWithHook {
    private final String TAG = CoffeeWithHook.class.getSimpleName();

    @Override
    public void brew() {
        Log.d(TAG, "brew: ");
    }

    @Override
    public void addCondiments() {
        Log.d(TAG, "addCondiments: ");
    }
}
