package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class DvdPlayer {

    private final String TAG = DvdPlayer.class.getSimpleName();
    String description;
    int currentTrack;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        Log.d(TAG, description + " on");
    }

    public void off() {
        Log.d(TAG, description + " off");
    }

    public void eject() {
        movie = null;
        Log.d(TAG, description + " eject");
    }

    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        Log.d(TAG, description + " playing \"" + movie + "\"");
    }

    public void play(int track) {
        if (movie == null) {
            Log.d(TAG, description + " can't play track " + track + " no dvd inserted");
        } else {
            currentTrack = track;
            Log.d(TAG, description + " playing track " + currentTrack + " of \"" + movie + "\"");
        }
    }

    public void stop() {
        currentTrack = 0;
        Log.d(TAG, description + " stopped \"" + movie + "\"");
    }

    public void pause() {
        Log.d(TAG, description + " paused \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        Log.d(TAG, description + " set two channel audio");
    }

    public void setSurroundAudio() {
        Log.d(TAG, description + " set surround audio");
    }

    public String toString() {
        return description;
    }
}
