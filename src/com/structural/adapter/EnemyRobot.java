package com.structural.adapter;

import java.util.Random;

//Adaptee 

public class EnemyRobot {

	Random generator = new Random();

	public void smashWithHands() {

		int damage = generator.nextInt(10) + 1;

		System.out.println("Enemy Robot does " + damage + " damage with hands");
	}

	public void walkForward() {

		int move = generator.nextInt(5) + 1;

		System.out.println("Enemy Robot moves " + move + " steps");

	}

 	public void reactToHuman(String driverName) {

		System.out.println("Enemy robot reacts on "+ driverName);

	}

}
