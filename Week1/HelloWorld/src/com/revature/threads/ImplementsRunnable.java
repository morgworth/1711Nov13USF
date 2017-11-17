package com.revature.threads;

<<<<<<< HEAD
public class ImplementsRunnable implements Runnable{

	
	@Override
	public void run() {
		System.out.println("In Implements Runnabble");
		for(int i =0; i < 10; i++){
			System.out.println(i + " **Impliments Runnable");
		}
	}
=======
public class ImplementsRunnable implements Runnable {
// 2 out of 2 ways to make a thread
//Runnable only has one abstract method - run - making it a functional interface
	
	@Override
	public void run() {
		System.out.println("In ImplementsRunnable");
		for(int i = 0; i < 10; i++){
			System.out.println(i + " in ImplementsRunnable");
		}
	}

>>>>>>> master
}
