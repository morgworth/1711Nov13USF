package Assignment;

import java.util.Random;

/*Write a program that demonstrates the switch case. Implement 
*	the following functionalities in the cases:
*	Case  1: Find the square root of a number using the Math class method.
*	Case  2: Display today’s date.
*	Case  3: Split the following string and store it in a sting array.
*	“I  am learning Core Java”
*/
public class SwitchCase {
	
	public static void main(String[] args) {
		
		switch(1){
		case 1: 
			int n;
			Random number = new Random();
			n = number.nextInt(100);
			System.out.println(Math.sqrt(9));
			break;
		}
		
	}
	

}
