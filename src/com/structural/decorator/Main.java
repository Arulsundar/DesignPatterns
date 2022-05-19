package com.structural.decorator;

public class Main {
	
	public static void main(String[] args)
	{   
		Pizza pizza =new PlainPizza();
		Pizza cheesePizza = new CheesePizza(new MushroomPizza(pizza));
		System.out.println(cheesePizza.getDescription());
		System.out.println(cheesePizza.getCost());
	}

}
