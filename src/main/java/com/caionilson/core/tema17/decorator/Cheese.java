package com.caionilson.core.tema17.decorator;

import com.caionilson.core.tema17.Pizza;

public class Cheese extends ToppingDecorator {

	public Cheese(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding cheese");
	}

	public String getDescription() {
		return topping.getDescription() + "\nCheese + $3.00";
	}

	public double getCost() {
		return topping.getCost() + 3.00;
	}

}
