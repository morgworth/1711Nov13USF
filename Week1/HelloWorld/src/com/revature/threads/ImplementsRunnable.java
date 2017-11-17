package com.revature.threads;

public class ImplementsRunnable implements Runnable{

	
	@Override
	public void run() {
		System.out.println("In Implements Runnabble");
		for(int i =0; i < 10; i++){
			System.out.println(i + " **Impliments Runnable");
		}
	}
}
