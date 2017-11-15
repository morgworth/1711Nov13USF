
//I made a new class

public class String {
	
	public static void main(String[] args) {
		
		String string1 = "Hello";
		String string2 = new String("Hello");
		
		System.out.println("Index of e" + string1.indexOf('l'));
		System.out.println("Lenght of the string" + string1.length());
		System.out.println("String.chatAt(3):\t\t" + string1.charAt(3));
		System.out.println("Last index of l" + 	string1.lastIndexOf('l'));
		System.out.println("String to UpperCase" + string1.toUpperCase());
		
	}

}
