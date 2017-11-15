import java.util.Scanner;

public class ControlFlow {
	
	public static void main(String[] args) {
		
	
	/*
	 * A java statement is a complete unit of execution
	 * with a semicolon following it
	 * 
	 * A control flow statement breaks up the flow of
	 * execution by using decision making, looping, & branching,
	 * allowing the application to selectively execute
	 * particulary segments of code
	 * 
	 * */
	
	System.out.println("Enter a number:");
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	
	if (x<10){
		System.out.println("Hello");
	}
	else if (x < 100){
		System.out.println("World");
	}
	else {
		System.out.println("Goodbye");
		
	}
	//TERNARY
	System.out.println(x<10? "Hello" : "Goodbye");
	
	//WHILE
	while(x<5){
		System.out.println("WHILE STATEMENT: " + x);
		x++;
	}
	// DO-WHILE
	do{
		System.out.println("DO-WHILE STATEMENT: " + x);
		x++;
	}while(x<5);
	
	//FORLOOP
	for(int i = 0; i < x; i++) {
		System.out.println("WOOOOOOO " + i);
		
	}
	/* 
	 * some notes about the for loop:
	 * 1. initialization statement executes
	 * 2. if boolean exp == true, else exit loop
	 * 3. execute body
	 * 4. execute update statemnt 
	 * 5. return to 2 
	 * */
	
	// FOR EACH AKA ENHANCED FOR LOOP
	int[] nums = {2, 4, 5, 7, 2, 351, 51, 53, 13};
	int sum = 0;
	for(int y : nums){
		sum += y;
		
	}
	System.out.println(sum);
	
	System.out.println("AT SWITCH STATEMENT NOW IGNORE OTHER STUFF");
	x = 5;
	
	//SWITCH
	/*
	 * cand hold int, byte, short, char, String, enum
	 * 
	 * */
	switch (x){
	case 1:
		System.out.println("x is 1");
		
	case 5:
		System.out.println("x is 5");
		break; // 
	case 10:
		System.out.println("x is 10");
		
	default:
		System.out.println("blah");
	}
	Operations op = Operations.ADD;
	System.out.println(op.calculate(10, 10));
	}
}
