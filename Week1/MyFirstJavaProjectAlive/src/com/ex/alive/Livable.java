package com.ex.alive;
// The pillars of OOPs
/*
 * 
 * Encapsulation
 * Polymorphism
 * Data Abstraction
 * Inhearitance
 * 
 * 
 * ###############################
 * Abstraction
 * ###############################
 * 
 * interfaces - blank templates  
 * 	they are used to define class behavior
 * 	enforce behavior from subclasses
 * 	hide implementation details
 * 
 * A CLASS IMPLIMENTS AN INTERFACE
 * 
 * 
 * Prior to JAVA 8, interfaces could not implement methods
 *
 */


public interface Livable {

	int reproduce(int numPartiesInvolved);
	
	void consume(String...substance);
	
	
	int perish(double TimeToLive);
	
	String waste();
	
	String move();
	
	
	
}





