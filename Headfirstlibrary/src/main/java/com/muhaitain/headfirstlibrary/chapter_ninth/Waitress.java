package com.muhaitain.headfirstlibrary.chapter_ninth;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/20.
 */

public class Waitress {
    private final String TAG = Waitress.class.getSimpleName();
    Menu pancakeHouseMenu;
    Menu dinerMenuIterator;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenuIterator) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenuIterator = dinerMenuIterator;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinerMenuIterator.createIterator();
        Log.d(TAG, "printMenu: Menu------BREAKFAST");
        printMenu(pancakeIterator);
        Log.d(TAG, "printMenu: Menu------DINNER");
        printMenu(dinnerIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            Log.d(TAG, "printMenu: " + menuItem.getName() + "--" + menuItem.descriptiom + "--" + menuItem.getPrice());
        }
    }
}
