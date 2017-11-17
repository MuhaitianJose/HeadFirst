package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class CdPlayer {
    private final String TAG = CdPlayer.class.getSimpleName();

    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
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
        title = null;
        Log.d(TAG, description + " eject");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        Log.d(TAG, description + " playing \"" + title + "\"");
    }

    public void play(int track) {
        if (title == null) {
            Log.d(TAG, description + " can't play track " + currentTrack +
                    ", no cd inserted");
        } else {
            currentTrack = track;
            Log.d(TAG, description + " playing track " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        Log.d(TAG, description + " stopped");
    }

    public void pause() {
        Log.d(TAG, description + " paused \"" + title + "\"");
    }

    public String toString() {
        return description;
    }
}
