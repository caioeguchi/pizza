package com.caionilson.core.tema17.decorator;

import com.caionilson.core.tema17.Pizza;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza topping;

	public ToppingDecorator(Pizza newTopping) {
		topping = newTopping;
	}

	public String getDescription() {
		return topping.getDescription();
	}

	public double getCost() {
		return topping.getCost();
	}

}
