package org.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHmEx {

	public static void main(String[] args) {
		Map<Integer, String> lhm= new LinkedHashMap<>();
// java, sql, oops, Sql, oracle, DB, selenium, psql, Hadoop
		lhm.put(10,"Java");
		lhm.put(20,"sql");
		lhm.put(30,"Oops");
		lhm.put(40,"Sql");
		lhm.put(50,"oracle");
		lhm.put(60,"db");
		lhm.put(10,"selenium");
		lhm.put(50,"pssql");
		lhm.put(40,"Haddop");
		
		System.out.println(lhm);
		//Keys alone 
		Set<Integer> keySet = lhm.keySet();
		System.out.println("Keys are: " + keySet);
		//iteration of keys and values
		System.out.println("Keys and values iteration:");
		Set<Entry<Integer, String>> entrySet = lhm.entrySet();
		 Iterator it = entrySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
