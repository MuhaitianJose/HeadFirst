package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class Projector {
    private final String TAG = Projector.class.getSimpleName();

    String description;
    DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        Log.d(TAG, description + " on");
    }

    public void off() {
        Log.d(TAG, description + " off");
    }

    public void wideScreenMode() {
        Log.d(TAG, description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        Log.d(TAG, description + " in tv mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return description;
    }
}
