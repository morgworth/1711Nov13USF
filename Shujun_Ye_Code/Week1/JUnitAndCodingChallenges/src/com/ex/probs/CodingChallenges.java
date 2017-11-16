package com.ex.probs;

public class CodingChallenges {
	
	public int factorial(int n) {
		if(n < 0) {
			return -1;
		}else if(n == 0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	public String reverseString(String s) {
		int length = s.length();
		for(int i = (length - 1); i >= 0; i--) {
			s += s.charAt(i);
		}
		return s.substring(length);
	}
}
