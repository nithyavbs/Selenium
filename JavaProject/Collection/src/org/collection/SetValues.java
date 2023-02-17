package org.collection;

import java.util.HashSet;
import java.util.Set;

public class SetValues {

	public static void main(String[] args) {
		Set<Integer> s= new HashSet<>();
//	 105, 205, 305, 405, 505, 605, 705, 805 
		s.add(105);
		s.add(205);
		s.add(305);
		s.add(405);
		s.add(505);
		s.add(605);
		s.add(705);
		s.add(805);
		System.out.println(s);
		for (Integer value : s) {
			System.out.println(value);
		}
		
		
	}

}
