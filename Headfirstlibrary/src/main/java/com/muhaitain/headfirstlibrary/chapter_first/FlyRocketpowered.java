package com.muhaitain.headfirstlibrary.chapter_first;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class FlyRocketpowered implements IFlyBehavior {
    private String TAG = FlyRocketpowered.class.getSimpleName();

    @Override
    public void fly() {
        Log.d(TAG, "fly: 我是通过火箭动力来飞行的！！");
    }
}
