package com.muhaitain.headfirstlibrary.chapter_eighth;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/20.
 *
 */

public abstract class CaffeIneBeverageWithHook {
    private final String TAG = CaffeIneBeverageWithHook.class.getSimpleName();

    public final void prapareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void pourInCup() {
        Log.d(TAG, "pourInCup: ");
    }

    public void boilWater() {
        Log.d(TAG, "boilWater: ");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
