package com.muhaitain.headfirstlibrary.chapter_ninth;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/20.
 */

public class DinerMenuIterator implements Iterator {
    private final String TAG = DinerMenuIterator.class.getSimpleName();
    int position = 0;
    MenuItem[] menuItems;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object menuItem = menuItems[position];
        position = position+1;
        return menuItem;
    }
}
