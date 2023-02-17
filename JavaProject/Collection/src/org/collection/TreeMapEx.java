package org.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
	
		Map <Character,Integer> tm= new TreeMap<>();
		tm.put('!', 10);
		tm.put('@', 20);
		tm.put('#', 30);
		tm.put('$', 40);
		tm.put('%', 50);
		tm.put('^', 60);
		tm.put('&', 10);
		tm.put('*', 50);
		tm.put('(', 40);
		System.out.println(tm);
		Set<Character> keySet =tm.keySet();
		System.out.println("Keys are: " + keySet);
		
		Set<Entry<Character, Integer>> entrySet = tm.entrySet();
		
		Iterator iter = entrySet.iterator();
		System.out.println("Keys and values:");
		
		while(iter.hasNext()) {
			
			System.out.println(iter.next());
		}
		
	}

}
