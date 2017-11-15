
public class Operators {

	/*
	 * A java operator is a special symbol that can be 
	 * applied to a set of variables, values, or literals-
	 * referred to as operands - and that returns a 
	 * unary - requires 1 operand
	 * binary - requires 2 operand
	 * ternary -3
	 * must be carried out in the following order: 
	 * */
	public static void main(String[] args) {
		
		//post unary operators
		int x = 10;
		x++; // same as x =x + 1;
		System.out.println(x);
		
		//pre-unary operators
		++x;
		--x;
		
		//other unary operators~, + , - , !
		int y = -x;
		y = +x;
		int z = ~4;
		System.out.println(z);
		
		//first order of binary operators from left to right --> * , / , %
		
		int test = 100/10%2*5;
				System.out.println(test);
				
				//addition and substraction
				int sum = 2 + 3;
				
				//shift operators <<, >>, >>>
				int shift = 1 << 5;
				int shift3 = 100 >>> 2;
				
				System.out.println(shift3);
				
				// relational operators <, >, <=, >=, instanceof
				// equals == !=
				// logical operator &, |, ^
				// short circuit operators &&, ||
				// ternary operator = [expression] ? [if yes] : [if no]
				int tern = shift < 1 ? 5 : 2;
				System.out.println(tern);
				
				// assignment operators:
				// =, +=, =+, *=, /=, &=, ^=, |=, <<=, >>=, >>>=
				
				shift >>>= 5;
				System.out.println(shift);
	}
}
