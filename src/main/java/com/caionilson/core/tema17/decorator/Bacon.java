package com.caionilson.core.tema17.decorator;

import com.caionilson.core.tema17.Pizza;

public class Bacon extends ToppingDecorator {

	public Bacon(Pizza newPizza) {
		super(newPizza);
		System.out.println("adding bacon");
	}

	public String getDescription() {
		return topping.getDescription() + "\nBacon + $3.50";
	}

	public double getCost() {
		return topping.getCost() + 3.50;
	}

}
