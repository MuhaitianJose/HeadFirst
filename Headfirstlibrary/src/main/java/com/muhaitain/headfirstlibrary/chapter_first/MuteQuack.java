package com.muhaitain.headfirstlibrary.chapter_first;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class MuteQuack implements IQuackBehavior {
    private final String TAG = MuteQuack.class.getSimpleName();

    @Override
    public void quack() {
        Log.d(TAG, "quack: 什么都不做，不会叫");
    }
}
