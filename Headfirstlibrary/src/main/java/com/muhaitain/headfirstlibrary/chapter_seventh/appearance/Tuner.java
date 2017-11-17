package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class Tuner {

    private final String TAG = Tuner.class.getSimpleName();

    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    public void on() {
        Log.d(TAG, description + " on");
    }

    public void off() {
        Log.d(TAG, description + " off");
    }

    public void setFrequency(double frequency) {
        Log.d(TAG, description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        Log.d(TAG, description + " setting AM mode");
    }

    public void setFm() {
        Log.d(TAG, description + " setting FM mode");
    }

    public String toString() {
        return description;
    }
}
