package org.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHmFor {

	public static void main(String[] args) {
		Map<Integer, Integer> lhm= new LinkedHashMap<>();
//		Key : 10, 20, 30, 40, 50, 60, 10, 50, 40 
//		Values : 10, 20, 30, 40, 50, 60, 10, 50, 40
		lhm.put(10,10);
		lhm.put(20,20);
		lhm.put(30,30);
		lhm.put(40,40);
		lhm.put(50,50);
		lhm.put(60,60);
		lhm.put(10,10);
		lhm.put(50,50);
		lhm.put(40,40);
		
		Set<Entry<Integer, Integer>> entrySet = lhm.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		}

}
