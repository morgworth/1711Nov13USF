package Assignment;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		int a, b, temp, min;
		
		//System.out.println("Please, enter two numbers");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter the first number: ");
		
		a = input.nextInt();
		
		System.out.println("Please, enter second number: ");
		
		b = input.nextInt();
		
		if (a < b){
			System.out.println("The minimun number is: " + a);
		}else{
			System.out.println("The minimun number is: " + b);
		
}
}
}