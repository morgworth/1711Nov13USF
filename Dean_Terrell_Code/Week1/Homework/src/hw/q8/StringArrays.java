package hw.q8;

import java.util.ArrayList;

public class StringArrays {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<String> palindromes = new ArrayList<String>();

		strings.add("karan");
		strings.add("madam");
		strings.add("tom");
		strings.add("civic");
		strings.add("radar");
		strings.add("sexes");
		strings.add("jimmy");
		strings.add("kayak");
		strings.add("john");
		strings.add("refer");
		strings.add("billy");
		strings.add("did");
		
		for(int i = 0; i < strings.size(); i++)
			if(isPalindrome(strings.get(i)))
				palindromes.add(strings.get(i));
		
		System.out.println("String array: ");
		for(String str : strings)
			System.out.printf("%s ", str);
		
		System.out.println("\nPalindrome array: ");
		for(String str : palindromes)
			System.out.printf("%s ", str);
	}
	
	static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}

}