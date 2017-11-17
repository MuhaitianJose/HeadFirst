package com.muhaitain.headfirstlibrary.chapter_sixth.model;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public class Light {
    private final String TAG = Light.class.getSimpleName();
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        Log.d(TAG, name+"on: ");
    }
    
    public void off(){
        Log.d(TAG, name+"off: ");
    }
}
