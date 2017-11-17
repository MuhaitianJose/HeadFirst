package com.muhaitain.headfirstlibrary.chapter_fourth.pizzastore;

import com.muhaitain.headfirstlibrary.chapter_fourth.factory.ChicagoPizzaIngredientFactory;
import com.muhaitain.headfirstlibrary.chapter_fourth.factory.NYPizzaIngredientFactory;
import com.muhaitain.headfirstlibrary.chapter_fourth.factory.PizzaIngredientFactory;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.CheesePizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.ClamPizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.PepperoniPizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.Pizza;
import com.muhaitain.headfirstlibrary.chapter_fourth.pizza.VeggiePizza;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("Cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
        } else if (type.equals("Clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        } else if (type.equals("Veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
