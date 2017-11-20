package com.revature.compare;

import java.util.Comparator;

public class Compare {
	public static void main(String[] args) {
		
		Student s1 = new Student("John", "Health", 32);
		Student s2 = new Student("Timothy", "Business", 21);
		
		CompareOps compOps = new Compare().new CompareOps();
		//compOps.compare(s1.getName(), s2.getName());
	}
	
	public class CompareOps implements Comparator<Student> {

		@Override
		public int compare(Student arg0, Student arg1) {
			// TODO Auto-generated method stub
			if(arg0.equals(arg1)){
				return 0;
			}else{
				return arg0.toString().compareTo(arg1.toString());
			}
		}
		
	}
}