package com.structural.bridge;

public class TvDevice extends Entertainmentdevice{
	
	public TvDevice(int newState,int newSetting)
	{
		devicestate=newState;
		maxSetting=newSetting;
	}

	@Override
	public void buttonFivePressed() {
            System.out.println("Channel down");		
            devicestate--;
	}

	@Override
	public void buttonSixPressed() {
		System.out.println("Channel up");		
        devicestate++;		
	}

}
