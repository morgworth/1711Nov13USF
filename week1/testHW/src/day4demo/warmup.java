package day4demo;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;

public class warmup {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//output of primes from 1 to 100
		ArrayList<Integer> nums=new ArrayList<>();
		for(int i=1;i<=100;i++){
			nums.add(i);
			if(isPrime(i)){
				System.out.println(i);
			}
		}
		
		//minimum of two numbers with ternary operators
		System.out.println("Input two integers to determine the minimum: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min = (a<b)?a:b;
		System.out.println("minimum is " + min);
		
		int choice;
		System.out.println("Input choice for switch: ");
		choice=sc.nextInt();
		
		//switch case
		switch(choice){
		case 1:
			System.out.println("Input number: ");
			int num=sc.nextInt();
			double sqrt= Math.sqrt(num);
			System.out.println("The square root is " + sqrt);
		case 2:
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		case 3:
			String toSplit="I am learning Core Java";
			String[] words=toSplit.split(" ");
			
		default:
			
		}
		
	} 
	
	boolean isEven(int num){
		int divide=num/2;
		return divide*2==num;
	}
	
	static boolean isPrime(int num){
		boolean check=true;
		int count=0;
		if(num>3){
			for (int i=num-1;i>1;i--){
				if(num%i==0){
					count++;
				}
			}
		}
		
		if(count>0){
			check=false;
		}
		
		return check;
	}
	
	
}
