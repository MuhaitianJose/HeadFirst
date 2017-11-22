package com.muhaitain.headfirstlibrary.chapter_ninth;

import java.util.ArrayList;

/**
 * Created by Muhaitian on 2017/11/20.
 */

public class PancakeHouseMenuIterator implements Iterator {

    private ArrayList items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }
}
