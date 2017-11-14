package com.muhaitain.headfirstlibrary.chapter_first;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class Quack implements IQuackBehavior {
    private final String TAG = Quack.class.getSimpleName();

    @Override
    public void quack() {
        Log.d(TAG, "quack: 实现鸭子的呱呱叫");
    }
}
