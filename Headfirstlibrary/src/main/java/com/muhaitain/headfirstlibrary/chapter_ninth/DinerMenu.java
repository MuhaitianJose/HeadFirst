package com.muhaitain.headfirstlibrary.chapter_ninth;

import android.util.Log;

/**
 * Created by Muhaitian on 2017/11/20.
 */

public class DinerMenu  implements Menu{
    private final String TAG = DinerMenu.class.getSimpleName();
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    int position = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day,with a side of potato salad",false,3.29);
        addItem("Hotdog","A hot dog,with saurkraut, relish, onions, topped with cheese",false,3.05);
    }

    public DinerMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            Log.d(TAG, "addItem: Sorry,menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }



}
