package org.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		Map<Integer,String> hm=new HashMap<>();
			
		hm.put(10,"java");
		hm.put(20, "sql");
		hm.put(30, "oops");
		hm.put(40, "Sql" );
		hm.put(50, "oracle");
		hm.put(60, "DB");
		hm.put(10, "selenium");
		hm.put(50, "psql");
		hm.put(40, "Hadoop");
		System.out.println(hm);
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		System.out.println(entrySet);
//		hm.forEach((k, v) -> {
//		    System.out.format("key: %d, value: %s%n", k, v);
//		});
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		System.out.println("Keys and values are");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set<Integer> keySet = hm.keySet();
		System.out.println("HashMap Key are:" + keySet);
		
	}

}
