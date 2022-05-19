package com.structural.decorator;

public class CheesePizza extends Decorator{

	public CheesePizza(Pizza pizza) {
		super(pizza);
		System.out.println("Preparing for Cheese Pizza");
		
	}
	
	public String getDescription()
	{
	    return pizza.getDescription() + "with Cheese";
	}
	
	public double getCost()
	{
		return  pizza.getCost() + 10;
	}

}
