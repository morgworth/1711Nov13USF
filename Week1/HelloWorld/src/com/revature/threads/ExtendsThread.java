package com.revature.threads;



public class ExtendsThread extends Thread{
// 1 out  of two ways o implement a thread
	
	public void run(){
		System.out.println("In Implements Runnabble");
		for(int i=0; i < 10000; i++){
			if(i%1000==0) {
			System.out.println(i + "in ExtendsThread");
	}
	
}
}
}