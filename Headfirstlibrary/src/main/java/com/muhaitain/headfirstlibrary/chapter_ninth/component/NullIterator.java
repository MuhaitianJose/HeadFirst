package com.muhaitain.headfirstlibrary.chapter_ninth.component;

import java.util.Iterator;

/**
 * Created by Muhaitian on 2017/11/21.
 */

public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
