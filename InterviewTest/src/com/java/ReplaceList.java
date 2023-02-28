package com.java;

import java.util.ArrayList;
import java.util.List;

public class ReplaceList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		//Input = 200,600,100,700,900
		
		li.add(200);
		li.add(600);
		li.add(100);
		li.add(700);
		li.add(900);
		System.out.println("Given List is:\n" + li);
		
		//replace 100 by 150
		
		li.set(2,150);
		System.out.println("Updated List is:\n" + li);
	}

}
