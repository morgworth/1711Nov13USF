import java.util.Arrays;
import java.util.Scanner;

public class UnderstandingArrays {
	/*
	 * An array is an area of memory on the heap with space
	 * for a designated number of elements
	 * Var args are variable arguments
	  */

	public static void main(String[] args) {
		System.out.println("Enter numbers to add separated by space:");
		Scanner scan = new Scanner(System.in);
		String nums = scan.nextLine();
		String[] numStrings = nums.split(" ");
		int[] numArr = new int[numStrings.length];
		
		for (int i = 0; i < numStrings.length; i ++){
			//numStrings[i] = numString[i].trim();
			numArr[i] = Integer.parseInt(numStrings[i]);
		}
		System.out.println(sum(numArr));
		
		//int a = sum();
		//int b = sum(1, 5, 7, 8, 135, 2463, 4);
		//int c = sum(5, 2);
	}
	
	static int sum(int x, int...is nums) {
		//int n = nums[0] //BAD;
		int s = 0;
		for(int i:nums){
			s= s + i;
		}
		return s;
	}
}
