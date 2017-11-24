package com.muhaitain.headfirstlibrary.chapter_twelfth.adapter;

import com.muhaitain.headfirstlibrary.chapter_twelfth.model.Goose;
import com.muhaitain.headfirstlibrary.chapter_twelfth.model.Quackable;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
