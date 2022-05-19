package com.structural.bridge;

public class TvPause extends RemoteButton {

	public TvPause(Entertainmentdevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
        
		System.out.println("Tv was Paused");
	}

}
