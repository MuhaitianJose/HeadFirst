package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class TheaterLights {
    private final String TAG = TheaterLights.class.getSimpleName();
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        Log.d(TAG, description + " on: ");
    }

    public void off() {
        Log.d(TAG, description + " off: ");
    }

    public void dim(int level) {
        Log.d(TAG, description + "dimming to " + level + "%");
    }

    @Override
    public String toString() {
        return description;
    }
}
