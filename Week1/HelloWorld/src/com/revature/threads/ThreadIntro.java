package com.revature.threads;

public class ThreadIntro extends Thread {

			
			
	public void run(){
		for(int i = 0; i < 10; i++ ){
			System.out.println(i + " this is thread intro");
		}
	}
}
