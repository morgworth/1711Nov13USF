package my_first_java_project;

public class humans extends Animals{
	private int age;
	private double height;
	private String hairColor;
	public humans()
	{
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	@Override
	public int reproduce(int partiesInvolved) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void consume(String... substance) {
		// TODO Auto-generated method stub
		
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
	//Overloading the move function
	public String move(String a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void speak(String speakslike) {
		// TODO Auto-generated method stub
		
	}

}