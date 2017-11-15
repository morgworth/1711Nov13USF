
public class ClassExamplesWeek1Operators {

	
	/*
	 * 
	 * Java operator is a special symbol that can be applied 
	 * to a set of variables, values, or literals.
	 * 
	 * Referred to as operands - and that returns a result. There are
	 * three types available in Java
	 * 
	 * Unary - requires 1 operand
	 * binary - requires 2 operands
	 * ternary - 3 operands
	 * 
	 *  must be carried out in the following order:
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// post0unary operators
		int x = 10;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		//pre-unary operators
		++x;
		--x;
		
		// other unary operators ~,+, -, !
		int y =-x;
		y = +x;
		int z = ~4;
		System.out.println(z);
		
		
		//first order of binary operators from the left to right --> *,/,%
		
		int test = 100/10%2*5;
		System.out.println(test);
		
		// addition and subtraction
		int sum = 2 + 3;
		// shift operators <<, >>, >>>
		int shift = 1 << 5;
		int shift3 = 100 >>>3; 
		System.out.println(shift);
		System.out.println(shift3);
		
		
		// relational operators <, >, <=, >=, instanceof
		
		// equals ==, !=
		
		// logical operator &, |, ^(XOR)
		
		// short circuit operators &&, ||
		
		// ternary operator = [expression] ? [if yes] : [if no]
		int tern = shift < 1 ? 5 : 2;
		System.out.println("this is the ternery operation: " + tern);
		
		
		//assignment operators:
		//=,+=,-=,*=,/=, %=,&=,^=, |=,<<=,>>=, >>>=
		
		shift3 >>>= 5;
		System.out.println("shift binary: " + shift3);
		
		
	}
	
}
