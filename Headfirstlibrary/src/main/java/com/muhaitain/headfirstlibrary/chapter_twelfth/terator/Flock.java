package com.muhaitain.headfirstlibrary.chapter_twelfth.terator;

import com.muhaitain.headfirstlibrary.chapter_twelfth.model.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Muhaitian on 2017/11/23.
 */

public class Flock implements Quackable {
    private ArrayList quackers = new ArrayList();

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }
    }
}
