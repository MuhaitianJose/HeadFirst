package com.muhaitain.headfirstlibrary.chapter_seventh.appearance;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class Screen {
    private final String TAG = Screen.class.getSimpleName();
    
    String description;

    public Screen(String description) {
        this.description = description;
    }
    
    public void up(){
        Log.d(TAG, description+" going up");
    }

    public void down(){
        Log.d(TAG, description+" going down");
    }

    @Override
    public String toString() {
        return description;
    }
}
