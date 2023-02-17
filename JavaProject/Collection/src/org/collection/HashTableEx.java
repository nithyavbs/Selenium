package org.collection;

import java.util.*;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {

		Hashtable<String, String> ht= new Hashtable<>();
//		Key : Sam, Karthik, Gowtham, Gokul, Neethu 
//		Values : Selenium, framework, oracle, corejava, jira
		ht.put( "Sam", "Selenium" );
		ht.put( "Karthik ","Framework");
		ht.put("Gowtham", "oracle");
		ht.put("Gokul", "corejava");
		ht.put("Neethu", "jira");
		System.out.println(ht);
		
		Set<String> keySet = ht.keySet();
		System.out.println(keySet);
		
		Set<Entry<String, String>> entrySet = ht.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		System.out.println("Keys and Values are:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
