package com.structural.bridge;

public abstract class RemoteButton {
	
	private Entertainmentdevice device;
	
	public RemoteButton(Entertainmentdevice device)
	{
		this.device=device;
	}
    
	public void buttonFivePressed() {
           device.buttonFivePressed();
	}

	public void buttonSixPressed() {
		device.buttonSixPressed();		
	}
	
	public void buttonSevenPressed() {
        device.buttonSevenPressed();
	}

	public void buttonEightPressed() {
		device.buttonEightPressed();		
	}
	
	public void feedback()
	{
		device.feedback();
	}
	
	public abstract void  buttonNinePressed();

}
