package com.muhaitain.headfirstlibrary.chapter_first;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class Squeak implements IQuackBehavior {
    private final String TAG = Squeak.class.getSimpleName();

    @Override
    public void quack() {
        Log.d(TAG, "quack: 橡皮鸭子吱吱叫");
    }
}
