package com.revature.io;

import java.io.Serializable;

<<<<<<< HEAD
<<<<<<< HEAD
// POJO  = Plain ol Java Object

public class Student implements Serializable {
	
	/*
	 * 
	 * The serialVersionUID is used as a version control in a serializable class. if you do not explicitly declare one, 
	 * the JVM will do it for you based on various aspects of 
	 * your serializable class
	 * 
	 */
	
	private static final long serialVersionUID = 5894314514287623512L;
	
	
	
	// access modifier "private"
	private String name;
	int age;
	
	public Student(){}
	
	
public Student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	}
	

=======
=======
>>>>>>> master
//POJO = Plain Ol' Java Object
public class Student implements Serializable {
	
	/**
	 * The serialVersionUID is used as a version control in a 
	 * Serializable class. If you do not explicitly declare one, 
	 * the JVM will do it for you based on various aspects of 
	 * your Serializable class
	 */
	//private static final long serialVersionUID = -1706602523015578910L;
	
	
	private String name;
	private int age;
	
	public Student(){} 
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
<<<<<<< HEAD
>>>>>>> master
=======
>>>>>>> master

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	
	@Override
	public String toString(){
		return name + ":" + age + "\n";
	}
=======
=======
>>>>>>> master
	@Override
	public String toString() {
		return name + ":" + age + "\n";
	}
	
	
	
	

<<<<<<< HEAD
>>>>>>> master
=======
>>>>>>> master
}
