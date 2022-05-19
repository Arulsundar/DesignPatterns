package com.structural.bridge;


public class TvMute extends RemoteButton{

	public TvMute(Entertainmentdevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
          System.out.println("Tv was Muted");		
	}

}
