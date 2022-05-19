package com.structural.decorator;

public class PlainPizza implements Pizza {


	@Override
	public String getDescription() {
		
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		return 40;
	}

}
