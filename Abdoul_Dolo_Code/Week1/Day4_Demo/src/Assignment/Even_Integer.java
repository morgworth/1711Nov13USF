package Assignment;

/*
 * Write a program to determine if an integer is even without
 * using the modulus operator (%) , and write a jUnit test case*/

public class Even_Integer {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int quotient = n / 2;
		
		if(quotient*2 == n){
			
			System.out.println("This number is even!" );
		}else{
			System.out.println("This number is not even!");
		}
	}

}
