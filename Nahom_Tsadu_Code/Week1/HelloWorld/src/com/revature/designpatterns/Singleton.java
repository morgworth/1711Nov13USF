package com.revature.designpatterns;

public class Singleton {
	
	int count = 0;
	private static Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}