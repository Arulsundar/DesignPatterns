package com.structural.bridge;

public class Main {
   
	//To decouple an abstraction and its implementation
	
	public static void main(String[] args) {
		RemoteButton tv1 = new TvMute(new TvDevice(1, 200));

		RemoteButton tv2 = new TvPause(new TvDevice(1, 200));

		System.out.println("Test Tv with Mute");

		tv1.buttonNinePressed();
		tv1.buttonFivePressed();
		tv1.buttonSixPressed();
		tv1.buttonSevenPressed();
		tv1.buttonEightPressed();
		tv1.feedback();

		System.out.println("Test Tv with pause");

		
		tv2.buttonFivePressed();
		tv2.buttonSixPressed();
		tv2.buttonSixPressed();
		tv2.buttonSixPressed();
		tv2.buttonSixPressed();
		tv2.buttonSevenPressed();
		tv2.buttonEightPressed();
		tv2.buttonNinePressed();
		tv2.feedback();
	}

}
