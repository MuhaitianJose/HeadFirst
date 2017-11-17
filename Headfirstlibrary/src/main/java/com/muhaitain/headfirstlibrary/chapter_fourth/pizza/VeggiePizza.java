package com.muhaitain.headfirstlibrary.chapter_fourth.pizza;

import com.muhaitain.headfirstlibrary.chapter_fourth.factory.PizzaIngredientFactory;

/**
 * Created by Muhaitian on 2017/11/15.
 */

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "ClamPizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        clams = pizzaIngredientFactory.createClam();
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
