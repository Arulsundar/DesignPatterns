package com.structural.decorator;

public class MushroomPizza extends Decorator {

	public MushroomPizza(Pizza pizza) {
		super(pizza);
		System.out.println("Preparing for Mushroom Pizza");

	}

	public String getDescription() {
		return pizza.getDescription() + "with Mushroom";
	}

	public double getCost() {
		return pizza.getCost() + 20;
	}

}
