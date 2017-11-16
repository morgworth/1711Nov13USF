package com.demo.collection;

import java.util.*;

public class SetDemo {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("This is a Set Demonstration");
		System.out.println("-----------------------------");
		System.out.println();
		
		//Declare and set our HashSet
		Set<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(new Integer(5));
		hashSet.add(new Integer(23));
		hashSet.add(new Integer(12));
		hashSet.add(new Integer(1));
		hashSet.add(new Integer(35));
		
		//Declare and set our TreeSet
		Set<Integer> treeSet = new TreeSet<Integer>(hashSet);
		
		//Declare and set our LinkedHashSet
		Set<Integer> linkedSet = new LinkedHashSet<Integer>(hashSet);
		
		//Print the initial Set
		System.out.println("The Set: ");
		SetOps.printSet(hashSet);
		
		//Print the size of the Set
		System.out.println("The Size of the Set: ");
		SetOps.printSize(hashSet);
		
		//Remove and element from the Set and print
		System.out.println("The Set after removing 23: ");
		SetOps.removeAndPrintSet(hashSet);
		
		//Check if values exist in the Set and Print
		System.out.println("Check values in the Set: ");
		SetOps.containsAndPrint(hashSet);
		
		//Print the ordered Set
		System.out.println("The TreeSet: ");
		SetOps.printSet(treeSet);
		
		//Print multiple times to show consistency
		System.out.println("The LinkedHashSet: ");
		SetOps.printSet(linkedSet);
		SetOps.printSet(linkedSet);
		SetOps.printSet(linkedSet);
		
	}
	
	public static class SetOps{
		
		static void printSet(Set<Integer> s){
			s.stream().forEach(i -> System.out.print(i + ", "));
			System.out.println();
			System.out.println();
		}
		
		static void printSize(Set<Integer> s){
			System.out.print(s.size());
			System.out.println();
			System.out.println();
		}
		
		static void removeAndPrintSet(Set<Integer> s){
			s.remove(23);
			s.stream().forEach(i -> System.out.print(i + ", "));
			System.out.println();
			System.out.println();
		}
		
		static void containsAndPrint(Set<Integer> s){
			boolean contains5 = s.contains(5);
			boolean contains117 = s.contains(117);
			System.out.println("The Set contains 5: " + contains5);
			System.out.println("The Set contains 117: " +contains117);
			System.out.println();
		}
	}
}