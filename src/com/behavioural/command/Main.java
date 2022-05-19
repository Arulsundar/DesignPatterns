package com.behavioural.command;

public class Main {
	
	public static void main(String[] args)
	{
		ElectronicDevice electronicDevice=Remote.getDevice("Radio");
		
		TurnOff on=new TurnOff(electronicDevice);
		
		ButtonInvoker button=new ButtonInvoker(on);
		
		button.press();
	}

}
