package com.ex.animals;

public class Human extends Animal {

	private int age;
	private String haircolor;
	private double height;

	public Human() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHaircolor() {
		return haircolor;
	}

	public void setHaircolor(String haircolor) {
		this.haircolor = haircolor;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int reproduce(int numPartiesInvolved) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int perish(double timeToLive) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String waste() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String move(String movelike) {
		// TODO Auto-generated method stub
		return movelike;
	}

	@Override
	void speak(String speakslike) {
		// TODO Auto-generated method stub

	}

}
