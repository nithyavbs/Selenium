package org.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEqual {

	public static void main(String[] args) {
		Set<Integer> s1= new HashSet<>();
//	 List = 10, 20, 30, 90, 10, 10, 40, 50
//				Input : List = 30, 40, 50, 60, 80 
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		System.out.println("HashSet 1 :" + s1);
		Set<Integer> s2= new HashSet<>();
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(80);
		System.out.println("HashSet 2 :" + s2);
		s1.retainAll(s2);
		System.out.println("Common Set Elements: " + s1);
		
		
	}

}
