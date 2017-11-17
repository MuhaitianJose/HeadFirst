package com.muhaitain.headfirstlibrary.chapter_fourth.factory;

import com.muhaitain.headfirstlibrary.chapter_fourth.material.Cheese;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Clams;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Dough;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.FreshClams;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Garlic;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.MarinaraSauce;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Mushroom;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Onion;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Pepperoni;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.RedPepper;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.ReggianoCheese;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Sauce;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.SlicedPepperoni;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.ThinCrustDough;
import com.muhaitain.headfirstlibrary.chapter_fourth.material.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
