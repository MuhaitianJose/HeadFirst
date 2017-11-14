package com.muhaitain.headfirstlibrary.chapter_first;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/14.
 */

public class FlyNoWays implements IFlyBehavior {
    private final String TAG = FlyNoWays.class.getSimpleName();
    @Override
    public void fly() {
        Log.d(TAG, "fly: 啥都不做，不能飞");
    }
}
