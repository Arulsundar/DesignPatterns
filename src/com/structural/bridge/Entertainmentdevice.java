package com.structural.bridge;

public abstract class Entertainmentdevice {
	
	public int devicestate;
	
	public int maxSetting;
	
	public int volumeSetting=0;
	
	public abstract void buttonFivePressed();
	
	public abstract void buttonSixPressed();
	
	public void feedback()
	{
		if(devicestate > maxSetting || devicestate < 0 )  
			devicestate = 0;
		System.out.println("On "+devicestate);
	}
	
    public void buttonSevenPressed()
    {
    	volumeSetting++;
    	System.out.println("Volume at" + volumeSetting);
    }
    
    public void buttonEightPressed()
    {
    	volumeSetting--;
    	System.out.println("Volume at" + volumeSetting);
    }
}
