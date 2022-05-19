package com.behavioural.command;

public class Radio implements ElectronicDevice{
	
	
	@Override
	public void turnOn() {
         System.out.println("RADIO is ON");		
	}

	@Override
	public void turnOff() {
		System.out.println("RADIO is OFF");		
	}


}
