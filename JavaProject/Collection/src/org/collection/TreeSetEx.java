package org.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Set<Integer> ts = new TreeSet<>();
//	i/p	List = 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		ts.add(90);
		ts.add(10);
		ts.add(20);
		//Ascending order without duplicate
		System.out.println("Tree Set:" + ts);
		
	}

}
