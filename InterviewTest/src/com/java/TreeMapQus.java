package com.java;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapQus {

	public static void main(String[] args) {
		Map<Integer,Integer> mp = new TreeMap<>();
		
//		Key: 10, 20, 30, 40, 50, 60, 10, 50, 40
//		Values: 10, 20, 30, 40, 50, 60, 10, 50, 40
		
		mp.put(10, 10);
		mp.put(20, 20);
		mp.put(30, 30);
		mp.put(40, 40);
		mp.put(50, 50);
		mp.put(60, 60);
		mp.put(10, 10);
		mp.put(50, 50);
		mp.put(40, 40);
		Set<Entry<Integer, Integer>> entrySet = mp.entrySet();
		System.out.println("Key Values of Tree Map:");
		for (Entry<Integer, Integer> entry : entrySet) {
		
			System.out.println(entry.getKey());
			
		}
		
	}

}
