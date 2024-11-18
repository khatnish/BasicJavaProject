package com.tutorials.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class List {

	public static void main(String[] args) {

		
		/*
		 *  List : part of Java Collection Framework
		 *  		It is a interface in the java.util package that extends the Collection<E> interface.
		 *  		orderd collection of elements that allows duplicate values.
		 *  		elements are stored by index
		 *  		maintain insertion order
		 *  		supports generics to define the type of elements they can contain e.g, List<String>
		 *  
		 *  
		 *  
		 *  Types: 
		 *  	1. ArrayList : insertion order is preserved
		 *  					growable in nature (Automatically resizes itself when elements are added or removed)
		 *  					duplicate element stores
		 *  					Index based access (more no of retriving is easy)
		 *  
		 *  					methods: (add(),size(),remove(),get(),isEmpty(),contains() etc....
		 *  
		 *  
		 *  *****************
		 *  
		 *  
		 *  	2. LinkedList : Linklist is a class which is implemented the methods of List interface
		 *  					as well as Deque interface.
		 *  					It also stores duplicate elements
		 *  					and insertion order preserved
		 *  					
		 *  					insertion and deletion more useful.
		 *  
		 *  			(data stores in node(previous and next node)so  when we try to retrieve it checks
		 *  				previous node and connects other node so it takes time on retrieving so it
		 *  					is not preferable in retrieving  )
		 *  
		 *  		In linklist every elements are linked to each other
		 *  		previous node and next node help to linked each and every element so it 
		 *  		follows Doubly Linked.
		 *  
		 *  		methods: add(), addFirst(), addLast(),  getFirst(),getLast(), removeFirst()
		 *  
		 *  
		 *  
		 *  	(Can be used as a Deque for both stack and queue operations.
		 *  		stack --> First In Last Out
		 *  		Queue --> FIFO)
		 *  					
		 */
		
		
		System.out.println(" ****ArrayList****");
		System.out.println();
		
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("Apple");
		al.add("banana");
		al.add("grapes");
		
		System.out.println(" Element at index 1 : "+ al.get(1));
		
		//update
		
		al.set(1, "blueberry");
		System.out.println(" Element at index 1 : "+ al.get(1));
		
		//remove
		
		al.remove(1);
		System.out.println("After removal : "+al);
		
		
		//check size
		
		System.out.println("Size is : "+al.size());
		
		
		//for loop
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(i);
			System.out.println(al.get(i));
		}
		
		
		//for each loop
		
		for(String a: al) {
			System.out.println(a);
		}
		
		//clear
		
		al.clear();
		
		System.out.println("Size after clear : "+al.size());
		
		
		
		al.add("nisha");
		al.add("nita");
		al.add("nilam");
		al.add("nirmala");
		
		System.out.println("--- Iterator ---");
		
		///Iterator in arraylist
		
		Iterator <String> it= al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		System.out.println();
		System.out.println(" ****LinkedList****");
		System.out.println();
		
		
		
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("apple");
		ll.add("strawberry");
		ll.add("amba");
		
		System.out.println("element in index 0 : "+ll.get(0));
		
		ll.set(0, "banana");
		System.out.println(ll);
		
		
		ll.remove("amba");
		System.out.println(ll);
		
		
		//adding element in begging and end
		
		ll.addFirst("mango");
		ll.addLast("cranberry");
		
		System.out.println(ll);
		
		
	}

}
