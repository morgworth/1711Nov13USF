package com.revature.designpatterns;

public class MainClass {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getCount());
		singleton.setCount(1);
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.getCount());
		
		ToolFactory tf = new ToolFactory();
		System.out.println(tf.getTool("hammer").work());
	}
}