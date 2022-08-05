package com.caionilson.core.tema17;

import org.junit.Test;

import com.caionilson.core.tema17.decorator.Bacon;
import com.caionilson.core.tema17.decorator.Cheese;

import junit.framework.Assert;

public class PizzaTest {

	@Test
	public void pizzaCheeseTest() {
		Pizza pizza = new Cheese(new PlainPizza());

		Assert.assertEquals("\nPizza + $20.00\nCheese + $3.00", pizza.getDescription());
		Assert.assertEquals(23.0, pizza.getCost());
	}

	@Test
	public void pizzaBaconTest() {
		Pizza pizza = new Bacon(new PlainPizza());

		Assert.assertEquals("\nPizza + $20.00\nBacon + $3.50", pizza.getDescription());
		Assert.assertEquals(23.5, pizza.getCost());
	}

}
