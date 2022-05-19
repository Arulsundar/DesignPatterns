package com.structural.adapter;

public class Main {

	public static void main(String[] args) {
		EnemyTank rx7Tank = new EnemyTank();

		EnemyRobot chittiRobot = new EnemyRobot();

		EnemyAttacker attacker = new EnemyRobotAttacker(chittiRobot);
   
		System.out.println("The Tank");

		rx7Tank.assignDriver("sundar");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();

		System.out.println("The Robot");

		chittiRobot.reactToHuman("Harish");
		chittiRobot.walkForward();
		chittiRobot.smashWithHands();
		
		// Robot which works with the help of adapter 
		System.out.println("The Robot with adapter");

		attacker.assignDriver("sss");
		attacker.driveForward();
		attacker.fireWeapon();

	}

}
