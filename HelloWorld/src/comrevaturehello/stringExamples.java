package comrevaturehello;

import java.util.Scanner;

public class stringExamples {
	public static void main(String[] args)
	{
		String name = "hello ";
		String trent = "trent";
		name = name.concat(trent);
		System.out.println(name);
		name = name.substring(3);
		System.out.println(name);
		boolean var = name.endsWith(trent);
		System.out.println(var);
		System.out.println(name.indexOf('t'));
		System.out.println(name.charAt(0));
	}
}
