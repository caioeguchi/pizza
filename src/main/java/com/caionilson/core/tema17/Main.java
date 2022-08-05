package com.caionilson.core.tema17;

import com.caionilson.core.tema17.decorator.Bacon;
import com.caionilson.core.tema17.decorator.Cheese;

public class Main {

	public static void main(String[] args) {

		Pizza pizza = new Cheese(new Cheese(new Bacon(new PlainPizza())));

		System.out.println("\nIngredients: " + pizza.getDescription());

		System.out.println("\nTotal: $" + pizza.getCost());

	}

}
