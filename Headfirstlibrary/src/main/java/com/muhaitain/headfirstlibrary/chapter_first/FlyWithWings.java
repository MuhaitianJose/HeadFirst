package com.muhaitain.headfirstlibrary.chapter_first;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class FlyWithWings implements IFlyBehavior{

    private final String TAG = FlyWithWings.class.getSimpleName();

    @Override
    public void fly() {
        Log.d(TAG, "fly: 用翅膀飞行");
    }
}
