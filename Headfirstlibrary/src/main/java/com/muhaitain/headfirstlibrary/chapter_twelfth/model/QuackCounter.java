package com.muhaitain.headfirstlibrary.chapter_twelfth.model;

import com.muhaitain.headfirstlibrary.chapter_twelfth.model.Quackable;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public class QuackCounter implements Quackable {
    private Quackable quackable;
    static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
