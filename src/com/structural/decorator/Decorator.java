package com.structural.decorator;

public abstract class Decorator implements Pizza {

	public Pizza pizza;

	public Decorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {

		return pizza.getDescription();
	}

	public double getCost() {
		return pizza.getCost();
	}

}
