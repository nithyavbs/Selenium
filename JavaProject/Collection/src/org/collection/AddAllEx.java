package org.collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AddAllEx {

	public static void main(String[] args) {
		List<Integer> li= new LinkedList<>();
		List<Integer> li2= new LinkedList<>();
		List<Integer> li3= new LinkedList<>();
		//Input : List = 10, 20, 30, 90, 10, 10, 40, 50 
//		List = 105, 205, 305, 405, 505, 605, 705, 805, 505, 605
//		List = 100, 200, 300, 400, 500, 600, 700, 100, 300, 500
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		System.out.println("list is:" + li);
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(li);
		System.out.println("The Set is:" + s);
		System.out.println("******************");
		li2.add(105);
		li2.add(205);
		li2.add(305);
		li2.add(405);
		li2.add(505);
		li2.add(605);
		li2.add(705);
		li2.add(805);
		li2.add(805);
		li2.add(505);
		li2.add(605);
		
		
		System.out.println("list2 is:" + li2);
		Set<Integer> s1 = new LinkedHashSet<>();
		s1.addAll(li2);
		System.out.println("The Set is:" + s1);
		
		
		System.out.println("******************");
		li3.add(100);
		li3.add(200);
		li3.add(300);
		li3.add(400);
		li3.add(500);
		li3.add(600);
		li3.add(700);
		li3.add(100);
		li3.add(300);
		li3.add(500);
		
		
		System.out.println("list2 is:" + li3);
		Set<Integer> s2 = new LinkedHashSet<>();
		s2.addAll(li3);
		System.out.println("The Set is:" + s2);
		
	}

}
