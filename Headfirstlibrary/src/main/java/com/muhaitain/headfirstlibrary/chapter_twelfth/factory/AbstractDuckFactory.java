package com.muhaitain.headfirstlibrary.chapter_twelfth.factory;

import com.muhaitain.headfirstlibrary.chapter_twelfth.model.Quackable;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
