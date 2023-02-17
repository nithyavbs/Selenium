package org.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetRemove {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
//	l1 :10, 20, 30, 90, 10, 10, 40, 50 
//			l2: 30, 40, 50, 60, 80

		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		System.out.println("Hashset S1:" + s1);
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(80);
		System.out.println("Hashset S2:" + s2);
//		s2.removeAll(s1);
//		System.out.println("Common elembent removed from Hashset S2:" + s2);
		s1.removeAll(s2);
		System.out.println("Common elembent removed from Hashset S1:" + s1);

		Set<Integer> ts= new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		System.out.println("tree set" + ts);
		Set<Integer> t= new TreeSet<Integer>();
		t.add(100);
		t.add(200);
		t.add(300);
		t.add(400);
		t.add(500);
		t.add(600);
		t.add(700);
		t.add(800);
		System.out.println("tree set2" + t);
		ts.removeAll(t);
		System.out.println(ts);
		
	}

}
