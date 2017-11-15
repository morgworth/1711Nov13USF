package com.ex.animals;

import com.ex.alive.Livable;


/*
 * 
 * ABSTRACT keyword
 * 
 * 
 * ENCAPSULATION
 * 
 * Restriction of access
 * variables declared private to hid data
 * maintain boundaries between components
 * 
 * 
 * INHERITANCE
 * 
 * CLASS CAN INHERIT MEMBERS FROM ANOTHER CLASS
 * 
 * INTERFACES CAN EXTEND OTHER INFTERFACES
 * 
 * 
 * 
 * 
 */





public abstract class Animal implements Livable {
	public void consume(String... substance){
		System.out.println("All animals eat and breathe");
		System.out.println("This eats: " + substance[0] + ".");
		System.out.println("This breathes by: " + substance[1] + ".");
	}
}

