package com.tutorials.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {

		
		/*
		 *  Set : insertion order not preserved
		 *  	: duplicate not allowed
		 *  
		 *  	(A Set in Java is a part of the Java Collections Framework
		 *  		 and represents a collection of unique elements.)
		 *  
		 *  
		 *  
		 *  	1. HashSet : duplicate not allowed
		 *  				no insertion order(no index concept)
		 *  				data structure hash table
		 *  				Heterogeneous data support
		 *  				Allows one null element
		 *  
		 *  				implements set interface
		 *  				
		 *  				best for quick lookups and retrivals.(elements are arranged in random
		 *  				order so sorting and suffeling is not directly possible)
		 *  
		 *  
		 *  	2. LinkedHashSet : duplicate not allowed
		 *  						insertion order preserved
		 *  
		 *  						Extends HashSet and maintains insertion order.
		 *  						Slightly slower than HashSet due to order maintenance
		 *  						data structure hash table + linked list
		 *  
		 *  
		 *  	3.TreeSet :  Maintains elements in sorted order
		 *  				Does not allow null
		 *  
		 *  	Set Operations (Union, Intersection, Difference)
		 */
		
		
		HashSet<Integer> nums= new HashSet<Integer>();
		nums.add(33);
		nums.add(22);
		nums.add(20);
		nums.add(33);   //duplicate not supports // no insertion order
		System.out.println(nums);
		
		Iterator<Integer> nit = nums.iterator();
		while(nit.hasNext()) {
			System.out.println(nit.next());
		}
		
		
		System.out.println(nums.contains(20));
		
		nums.remove(20);
		System.out.println(nums);
		for(int nn: nums) {
			System.out.println(nn);
		}
		
		
		System.out.println();
		System.out.println("******");
		System.out.println();
		LinkedHashSet <Integer> n=new LinkedHashSet<Integer>();  //preservs insortion order
		n.add(10);
		n.add(60);
		n.add(12);
		
		System.out.println(n);
		
		n.add(33);
		System.out.println(n);
		
		
		System.out.println();
		System.out.println("******");
		System.out.println();
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();   ///sorted order
		ts.add(3);
		ts.add(3111);
		ts.add(358);
		ts.add(30);
		ts.add(300);
		ts.add(399);
		
		System.out.println(ts);
		
		
		
	}

}
