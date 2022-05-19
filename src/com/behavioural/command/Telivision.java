package com.behavioural.command;

public class Telivision implements ElectronicDevice {
    
	
	@Override
	public void turnOn() {
         System.out.println("TV is ON");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV is OFF");		
	}

}
