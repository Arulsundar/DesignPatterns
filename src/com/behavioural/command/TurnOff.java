package com.behavioural.command;

public class TurnOff implements Command{
	
	ElectronicDevice electronicDevice;
	
	 public TurnOff(ElectronicDevice electronicDevice) {
		
		this.electronicDevice=electronicDevice;
	}

	@Override
	public void execute() {
		
		electronicDevice.turnOff();
		
	}
	

}
