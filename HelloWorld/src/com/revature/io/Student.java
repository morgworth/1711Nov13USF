package com.revature.io;
//POJO - plain old java object
public class Student 
{
	private String name;
	int age;
	public Student(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}

	public Student() 
	{

	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return name + ":" + age+"\n";
	}
	
}