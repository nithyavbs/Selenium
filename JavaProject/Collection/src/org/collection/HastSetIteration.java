package org.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HastSetIteration {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		// : List = 10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20
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
		System.out.println("Hash Set:" + s);
		Iterator<Integer> iter = s.iterator();
		System.out.println("Traversing over HashSet using iterator");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
