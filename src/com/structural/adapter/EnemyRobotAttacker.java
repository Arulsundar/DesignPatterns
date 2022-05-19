package com.structural.adapter;

//Adapter
public class EnemyRobotAttacker implements EnemyAttacker {
	
	EnemyRobot robot;
	public EnemyRobotAttacker(EnemyRobot robot) {
		
		this.robot=robot;
	}

	@Override
	public void fireWeapon() {
		
		robot.smashWithHands();
		
	}

	@Override
	public void driveForward() {

		robot.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
      
		robot.reactToHuman(driverName);
	}

}
