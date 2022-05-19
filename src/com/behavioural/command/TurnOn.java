package com.behavioural.command;

public class TurnOn implements Command{
	
	ElectronicDevice electronicDevice;
	
	 public TurnOn(ElectronicDevice electronicDevice) {
		
		this.electronicDevice=electronicDevice;
	}

	@Override
	public void execute() {
		
		electronicDevice.turnOn();
		
	}
	
	

}
