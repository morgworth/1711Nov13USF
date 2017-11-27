package Assignment;

import java.util.ArrayList;

/*
 * Write a program that creates an ArrayList which stores numbers
 * from 1 to 100 and prints out all the prime numbers to the console.*/
public class ArrayListNumber {

	//private static final ArrayList<Integer> Pnum = null;

	public static void main(String[] args) {
		
		ArrayList<Integer> pnum = new ArrayList<Integer>();
		
		for (int j = 1; j < 101; j ++) {
			
			boolean isPr = true;
		
			for (int i = 2; i < j; i++)
				
				if (j % i == 0) isPr = false;
			
			if (isPr){
				
				System.out.println(j + " ");
				pnum.add(j);
				//ERROR IN CODE
			}
				
				
			
	}
	
}
}
