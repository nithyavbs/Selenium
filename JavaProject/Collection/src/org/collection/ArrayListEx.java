package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
//		List<String> ls= new ArrayList<>();
//		ls.add("10");
//		ls.add("sfr");
//		System.out.println(ls);
		
		//: List = 10, 20, 30, 90, 10, 10, 40, 50 
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(90);
		al.add(10);
		al.add(10);
		al.add(40);
		al.add(50);
		//al.add("sajfg");
		System.out.println(al);
		int size = al.size();
		System.out.println("ArrayList Size is:" + size);
		
		}
	

}
