package my_first_java_project;

public abstract class Animals implements livable
{
	 void consume(String eat, String breathe)
	 {
		 System.out.println("all animals eat and breathe");
		 System.out.println("This eats"+eat);
		 System.out.println("This breathes by"+breathe);
	 }
	 abstract void speak(String speakslike);
}