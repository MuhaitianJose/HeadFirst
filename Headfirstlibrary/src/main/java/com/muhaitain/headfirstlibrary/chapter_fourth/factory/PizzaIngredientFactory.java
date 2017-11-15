package com.muhaitain.headfirstlibrary.chapter_fourth.factory;

import com.muhaitain.headfirstlibrary.chapter_fourth.material.Cheese;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Clams;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Dough;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Pepperoni;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Sauce;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
