package com.muhaitain.headfirstlibrary.chapter_seventh.duck;

import com.muhaitain.headfirstlibrary.chapter_seventh.duck.Duck;
import com.muhaitain.headfirstlibrary.chapter_seventh.duck.Tuckey;

/**
 * Created by Muhaitian on 2017/11/17.
 */

public class TurkeyAdapter implements Duck {

    Tuckey tuckey;

    public TurkeyAdapter(Tuckey tuckey) {
        this.tuckey = tuckey;
    }

    @Override
    public void quack() {
        if (tuckey != null) {
            tuckey.gobble();
        }
    }

    @Override
    public void fly() {
        if (tuckey != null) {
            for (int i = 0; i < 5; i++) {
                tuckey.fly();
            }
        }
    }
}
