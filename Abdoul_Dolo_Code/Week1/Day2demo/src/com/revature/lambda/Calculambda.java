package com.revature.lambda;

public class Calculambda {
	
	public static void main(String[] args) {
		
		Calculable add = (hello, world) -> {
			return hello + world;
		};
		
	}

}
@FunctionalInterface
interface Calculable {
	double calculate(int a, int b); 
}