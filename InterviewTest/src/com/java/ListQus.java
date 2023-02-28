package com.java;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListQus{

	public static void main(String[] args) {
		List<Integer> li = new LinkedList<Integer>();
//		i/p=50,20,60,80,50,40,50
		li.add(50);
		li.add(20);
		li.add(60);
		li.add(80);
		li.add(50);
		li.add(40);
		li.add(50);
		System.out.println("Given List:\n" + li);
		Collections.replaceAll(li, 50, 400);
		System.out.println("Updated List:\n" + li);
		
	}

}
