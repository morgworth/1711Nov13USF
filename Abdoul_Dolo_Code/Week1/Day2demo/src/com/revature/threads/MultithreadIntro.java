package com.revature.threads;

public class MultithreadIntro {
	
	public static void main(String[] args) {
		
		ExtendsThread et = new ExtendsThreads();
		//et.run();
		
		ImplementsRunnable ir = new ImplementsRunning();
		Thread isThread = new Thread(ir);
	}

}
