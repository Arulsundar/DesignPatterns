package com.behavioural.command;

public class Remote {
	
	 public static ElectronicDevice getDevice(String device)
	 {
		 if(device.equals("TV"))
			 return new Telivision();
		 else 
			 return new Radio();
					
	 }

}
