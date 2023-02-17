package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<>();
		Set<Integer> lhs2= new LinkedHashSet<>();
//		10, 10, 20, 50, 60, 80, 60, 50
		lhs.add(10);
		lhs.add(10);
		lhs.add(20);
		lhs.add(50);
		lhs.add(60);
		lhs.add(80);
		lhs.add(60);
		lhs.add(50);
		//remove duplicates
	//	System.out.println("Removed Duplicates:" + lhs);
		//i/p 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20
		lhs2.add(10);
		lhs2.add(20);
		lhs2.add(30);
		lhs2.add(40);
		lhs2.add(50);
		lhs2.add(60);
		lhs2.add(70);
		lhs2.add(80);
		lhs2.add(90);
		lhs2.add(10);
		lhs2.add(20);
		System.out.println(lhs2);
	}

}
