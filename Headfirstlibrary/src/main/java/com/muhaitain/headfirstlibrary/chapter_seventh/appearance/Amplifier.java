package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class Amplifier {
    private final String TAG = Amplifier.class.getSimpleName();
    String description;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        Log.d(TAG, "on: ");
    }

    public void off() {
        Log.d(TAG, "off: ");
    }

    public void setStereoSound() {
        Log.d(TAG, description + " stereo mode on");
    }

    public void setSurroundSound() {
        Log.d(TAG, description + " Surround Sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        Log.d(TAG, "setting volume to " + level);
    }

    public void setTuner(Tuner tuner) {
        Log.d(TAG, description + "setting Tuner to " + tuner);
        this.tuner = tuner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        Log.d(TAG, description + "setting DvdPlayer to " + dvdPlayer);
        this.dvdPlayer = dvdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        Log.d(TAG, description + "setting CdPlayer to " + cdPlayer);
        this.cdPlayer = cdPlayer;
    }

    @Override
    public String toString() {
        return description;
    }
}
