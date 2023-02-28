package com.java;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapQus {

	public static void main(String[] args) {
	
		Map<Integer, String> mp = new TreeMap<>();

		mp.put(10, "java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "sql");
		Set<Entry<Integer, String>> entrySet = mp.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
