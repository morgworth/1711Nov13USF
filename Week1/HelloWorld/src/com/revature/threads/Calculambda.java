package com.revature.threads;




public class Calculambda {

	public static void main(String[] args) {
		
		
		Calculable add = (a, b) -> {
			if(a  < 0) { 
				throw new Exception();
				
			}else { 
				return a + b;
			}
		};
		try {
			
		}
		
	}
	
	@FunctionalInterface
	interface Calculate{
		double calculate(int a, int b);
	}
	
}
