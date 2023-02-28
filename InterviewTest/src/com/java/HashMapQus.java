package com.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapQus {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();

		hm.put(10, "java");
		hm.put(20, "sql");
		hm.put(30, "oops");
		hm.put(40, "Sql");
		hm.put(50, "oracle");
		hm.put(60, "DB");
		hm.put(10, "selenium");
		hm.put(50, "psql");
		hm.put(40, "Hadoop");
	
		System.out.println(hm);
	
		Set<Entry<Integer, String>> entrySet = hm.entrySet();

		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		System.out.println("Keys and values are");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
