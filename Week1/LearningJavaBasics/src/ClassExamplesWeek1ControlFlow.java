import java.util.Scanner;


public class ClassExamplesWeek1ControlFlow {

	
	/*
	 * 
	 * A java statement is a complete unit of execution with a semicolon following it
	 * 
	 * A control flow statement breaks up the flow of 
	 * execution by using decision making, looping, and branching,
	 * allowing the application to selectively execute
	 * particular segments of code
	 * 
	 * 
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		
		
		// if statement
		
		if(x<10){
			System.out.println("Hello");
		}else if (x<100){
			System.out.println("There");
		}else{
			System.out.println("your number is out of here!");
		}
	
		
		
		//Ternary
		System.out.println(x<10? "Hello" : "your number is out of here!");
		
		// While loop
		while(x<5){
			x++;
			if(x<3) continue;
			System.out.println("While statement: " + x);
			
		}
		
		// Do-While
		do{
			System.out.println("Do while Statement: " + x);
			x++;
		}while(x<5);
		
		
		for(int i = 0; i < x; i++){
			System.out.println("Whooooo " + i);
		}
		/*
		 * notes
		 * 1. initialization statement executers
		 * 2.if boolean expression == true, else exit the loop
		 * 3. execute body
		 * 4.execute update statement
		 * 5. return 2
		 * 
		 */
		
		
		// for each aka enhanced for loop
		int[] nums = {2,3,4,6,8,23, 45,63};
		int sum = 0;
		for(int y : nums){
			sum += y;
		}
		System.out.println(sum);
		
		
		// Switch statements
		switch(x){
		case 1:
			System.out.println("case 1");

		case 5:
			System.out.println("case 5");
			break; 
		case 10: 
			System.out.println("case 10");

			
		default:
			System.out.println("default");
		}
		
		ClassExamplesWeek1ENUMuse op = ClassExamplesWeek1ENUMuse.ADD;
		System.out.println(op.calculate(10,10));
		
//\\\\\\\\\\\\\\\\\\\\\		
	}

}
