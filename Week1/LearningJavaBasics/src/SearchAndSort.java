import java.util.Scanner;
import java.util.Arrays;

public class SearchAndSort {

/// Wezley Singleton // primary coder on this. 
// Anthony Rhodes / Assisted. 
	// This was the first attempt at Sort of index of array.
	
	
	
	
    public static void main(String[] args) {
        System.out.println("Please enter a list of intergers split by space.");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        
        String[] userArr = userInput.split(" ");
        int[] numArr = new int[userArr.length];
        		
        		for(int i = 0; i< numArr.length; i++) {
        			numArr[i] = Integer.parseInt(userArr[i]);
        			
        		}
        binarySearch(13, numArr);
        scan.close();
        
    }
    
    
    static void binarySearch(int value, int... nums) {
    	
    	Arrays.sort(nums);
    	
    	int midpoint = nums.length / 2;
    	
    	if (nums[midpoint] == value){
    		System.out.println( "The index location with value" + value + " is index location " + midpoint);
    		
    	} else if (nums[midpoint] > value) {
    		int[] x = Arrays.copyOfRange(nums, 0, midpoint);
    		binarySearch(value, x);
    		
    	} else if (nums[midpoint] < value) {
    		int[] y = Arrays.copyOfRange(nums, midpoint + 1 , nums.length -1);
    		binarySearch(value, y);
    		
    	}else { 
    		System.out.println(" Value is not inside the given array." );
    	}
    
    }
    
}
