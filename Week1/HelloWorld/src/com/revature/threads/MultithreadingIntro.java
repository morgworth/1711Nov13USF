package com.revature.threads;




/*
 * 
 * 
 * States of a thread:
 * New - new thread
 * Runnable - when ready to run (may be running or simply
 * ready to run at any instance)
 * 
 * Blocked - aka waiting state - when a thread is temporarily inactive it is either blocked or waiting 
 * A thread is in the blocked state when it tries to access
 * a protected section of code that's currently locked
 * in some other thread
 * Waiting - threads can be made to wail for other actions or:
 * Timed Waiting - can call a timed wait method in threads
 * Terminated - a thread terminates because either it finishes
 * its thread of execution naturally or because some unusual or exceptional
 * event occurs.
 * 
 * 
 * 
 */











public class MultithreadingIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread et = new ExtendsThread();
		et.run();
		
		
		ImplementsRunnable ir = new ImplementsRunnable();
		Thread isThread = new Thread(ir);
		
		
		Runnable anonRun	= new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("In Anonymous calss implementation");
				for(int i = 0; i < 10; i++){
					System.out.println(i + " in non class method ");
				}
			}	
		};
		Thread anonThread = new Thread(anonRun);
		
		Thread exThread = new Thread(){
		// implement() run here	
		
		};
		// Lambda expression to implement runnable
		Runnable lambda = () -> {
		
		};
		
		Thread lambdaThread = new Thread(lambda);
		anonThread.setPriority(Thread.MAX_PRIORITY);
	System.out.println("STATEL " + et.getState());
	isThread.start();
	et.start();
	System.out.println("STATEL " + et.getState());
	anonThread.start();
	lambdaThread.start();
	System.out.println("STATEL " + et.getState());
}	
}

