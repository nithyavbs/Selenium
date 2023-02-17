package org.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
public static void main(String[] args) {
	List<Integer> ll = new LinkedList<>();
//	 List = 100, 200, 300, 400, 500, 600, 700 
	ll.add(100);
	ll.add(200);
	ll.add(300);
	ll.add(400);
	ll.add(500);
	ll.add(600);
	ll.add(700);
	System.out.println(ll);
	int size = ll.size();
	System.out.println("LinkedList Size is: " + size);
}
}
