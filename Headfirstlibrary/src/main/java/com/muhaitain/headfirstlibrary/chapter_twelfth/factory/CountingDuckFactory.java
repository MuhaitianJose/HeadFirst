package com.muhaitain.headfirstlibrary.chapter_twelfth.factory;

import com.muhaitain.headfirstlibrary.chapter_twelfth.model.DuckCall;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.MallardDuck;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.QuackCounter;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.Quackable;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.RedheadDuck;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.RubberDuck;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
