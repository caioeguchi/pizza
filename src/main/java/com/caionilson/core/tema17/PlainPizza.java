package com.caionilson.core.tema17;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "\nPizza + $20.00";
	}

	@Override
	public double getCost() {
		return 20.00;
	}

}
