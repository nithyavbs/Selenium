package org.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetValues {

	public static void main(String[] args) {
		Set<Integer> s= new TreeSet<>();
		// List = 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20 
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		System.out.println("Tree Set:" + s);
		
		Iterator<Integer> iter = s.iterator();
		System.out.println("Traversing over TreeSet using Iterator");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
