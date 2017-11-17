package com.muhaitain.headfirstlibrary.chapter_sixth.model;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class Stereo {
    private final String TAG = Stereo.class.getSimpleName();

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        Log.d(TAG, name + "on: ");
    }

    public void off() {
        Log.d(TAG, name + "off: ");
    }

    public void setCd() {
        Log.d(TAG, name + "setCd: ");
    }

    public void setDvd() {
        Log.d(TAG, name + "setDvd: ");
    }

    public void setVolume(int volume) {
        Log.d(TAG, name + "setVolume: volume=" + volume);
    }
}
