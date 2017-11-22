package com.muhaitain.headfirstlibrary.chapter_ninth;

import java.util.Hashtable;

/**
 * Created by Muhaitian on 2017/11/20.
 */

public class CafeMenu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItems("Veggie Burger and Air Fries", "Veggie burger on a wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItems("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItems("Burrito", "A large burrito, with whole pinto, salsa, guacamole", true, 4.29);
    }

    public void addItems(String name, String description, boolean vegetarian, double prices) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, prices);
        menuItems.put(menuItem.getName(), menuItem);

    }
}
