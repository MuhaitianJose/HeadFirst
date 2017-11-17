package com.muhaitain.headfirstlibrary.chapter_sixth.model;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/16.
 */

public class GarageDoor {
    private final String TAG = GarageDoor.class.getSimpleName();

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        Log.d(TAG, name + "up: ");
    }

    public void down() {
        Log.d(TAG, name + "down: ");
    }

    public void stop() {
        Log.d(TAG, name + "stop: ");
    }

    public void lightOn() {
        Log.d(TAG, name + "lighton: ");
    }

    public void lightOff() {
        Log.d(TAG, name + "lightOff: ");
    }

}
