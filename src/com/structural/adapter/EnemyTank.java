package com.structural.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
   
	Random generator =new Random();
	
	@Override
	public void fireWeapon() {
        
		int damage=generator.nextInt(10) +1;
		
		System.out.println("Enemy Tank does " + damage + " damage");
	}

	@Override
	public void driveForward() {
		
		int move=generator.nextInt(5) +1;
		
		System.out.println("Enemy Tank moves " + move + " steps");
		
	}

	@Override
	public void assignDriver(String driverName) {
		
		System.out.println(driverName +" is driving the tank");
		
	}

}
