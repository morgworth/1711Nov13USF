package day3demo;

public class StringsandThings {

	
	public static void main(String[] args) {
	String str = "hello";
	StringBuffer buff = new StringBuffer("hello");
	StringBuilder build = new StringBuilder("hello");
	
	
	str.concat(" world");
	buff.append(" world");
	build.append(" world");
	
	System.out.println(str + " " + buff + " " + build);
	
	System.out.println(buff.reverse());
	
	testBuild(build.toString());
	
	
	}
	static String testBuild(String sb){
		return sb;
		
	}
	
}
