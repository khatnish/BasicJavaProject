package com.tutorials.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mappss {

	public static void main(String[] args) {

		/*
		 *  Map : Interface
		 *  	Map is collection of entries and entries is a combination of key and value.
		 *  
		 * 		Key-Value Pairs: Each entry consists of a key and a value
		 * 		Unique Keys: Keys must be unique, but values can be duplicated.
		 * 		Null Keys and Values:
							Some implementations allow one null key (e.g., HashMap),
							 while others do not (e.g., TreeMap).
							Many implementations allow multiple null values.
							
							
				1.HashMap: underlying data structure hashtable
							allows one null key and multiple null values
							duplicate key not allowed but duplicate value allows
							Fast for lookups and updates.
							
							
							
							
				2. LinkedHashMap :Maintains insertion order.
									Slightly slower than HashMap for lookups due
									 to the added ordering overhead.
									 
									 
				3. HashTable : Synchronized and thread-safe.    ///if we need mutiple thread so we go for hashtable otherwise hashmap
								Does not allow null keys or values.
								Slower than HashMap.
		 */
		
		
		
		//hashmap
		
		Map<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		
		map.put(1, "amala");
		System.out.println(map);
		map.remove(1);
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for(int k: map.keySet()) {
			System.out.println(k+map.get(k));
		}
		
		map.put(1, "grapes");
		
		
		//using entryset
		
		for(Entry<Integer, String> en: map.entrySet()) {
			System.out.println(en.getKey() + " : "+ en.getValue());
		}
		
	}

}
