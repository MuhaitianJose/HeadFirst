package com.muhaitain.headfirstlibrary.chapter_twelfth.factory;

import com.muhaitain.headfirstlibrary.chapter_twelfth.model.DuckCall;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.MallardDuck;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.Quackable;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.RedheadDuck;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.RubberDuck;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
