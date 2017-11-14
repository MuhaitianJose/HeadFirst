package com.muhaitain.headfirstlibrary.chapter_first;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/13.
 */

public abstract class Duck {
    protected String TAG = Duck.class.getSimpleName();

    protected IFlyBehavior iFlyBehavior;
    protected IQuackBehavior iQuackBehavior;

    public void performFly() {
        if (iFlyBehavior != null) {
            iFlyBehavior.fly();
        }
    }

    public void performQuack() {
        if (iQuackBehavior != null) {
            iQuackBehavior.quack();
        }
    }

    public abstract void display();

    public void swim() {
        Log.d(TAG, "swim: I can swim");
    }

    public void setIFlyBehavior(IFlyBehavior iFlyBehavior) {
        this.iFlyBehavior = iFlyBehavior;
    }

    public void setIQuackBehavior(IQuackBehavior iQuackBehavior) {
        this.iQuackBehavior = iQuackBehavior;
    }
}
