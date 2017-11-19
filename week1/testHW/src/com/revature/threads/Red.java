package com.revature.threads;

public class Red implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Red rules.");
			synchronized(RedvsBlueDeadlock.blueFlag) {
				synchronized(RedvsBlueDeadlock.redFlag) {
					RedvsBlueDeadlock.redFlag="secure";
					RedvsBlueDeadlock.blueFlag="taken";
					System.out.println("Red: "+RedvsBlueDeadlock.redFlag+" Blue: "+RedvsBlueDeadlock.blueFlag);
				}
			}
		}
	}
}
