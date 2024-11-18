package com.tutorials.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {

		
		/*
		 *  Queue : A Queue in Java is a part of the Java Collections Framework
		   		 and represents a data structure designed to follow the FIFO
		   		 (First-In-First-Out) principle. In a queue, elements are added
		   			 at the tail (end) and removed from the head (front).
		   
		 *  		FIFO Order: The first element added is the first one removed.
		 *  		Dynamic Size: Most implementations grow dynamically as needed.
		*			Null Elements: Some implementations allow null elements
					 (e.g., LinkedList), but others (e.g., PriorityQueue) do not
					 
					 
					 Queue interface is part of the java.util package and
					  extends the Collection interface 
					  
					  
					  
				1. LinkedList : implements Queue and deque interfaces
								Doubly linked list that allows efficient insertion and deletion.
					 			Can contain null elements.
					 			
					 			
					 			
					 			
					 			
				2. PriorityQueue : Implements Queue and stores elements in natural order
				 					or based on a custom comparator.
									Does not allow null elements.
									Performance is logarithmic for insertion and removal.
									
									
				3. ArrayDeque :  Implements Deque and is faster than LinkedList for both stack 
									and queue operations.
									Does not allow null elements.
									Preferred for most queue implementations.
		 */
		
		
		System.out.println("queue linkedlist");
		LinkedList <String> queue= new LinkedList<String>();
		
		queue.add("nisha");
		queue.add("yogesh");
		queue.add("manoj");
		
		System.out.println("Displaying queue : "+queue);
		
		//peek at the head
		System.out.println("Head : "+queue.peek());   //first element ( if queue is empty peek() return null)
		
		//remove
		System.out.println("Removed : "+queue.poll()); //remove first(head element) and return same(if queue is empty
															//poll() return null)
		
		
		System.out.println("Queue after removal : "+ queue);
		
	System.out.println(queue.element());   //head element like peek( if queue is empty element() through exception)
	
	
	System.out.println(queue.remove());    //remove first(head element) and return same(if queue is empty
											//remove() through exception)
	
	System.out.println("Removed : "+queue.poll());
	
	System.out.println("Removed : "+queue.poll());   //this time return null;
	System.out.println("Head : "+queue.peek()); 	//null
	
	
//	System.out.println(queue.element());   //no such element exception
//	
//	System.out.println(queue.remove());   //no such element exception
		
	
	
	
	
	System.out.println("PriorityQueue");
	PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();

     // Add elements
     queue1.add(50);
     queue1.add(10);
     queue1.add(30);

     // Display the queue
     System.out.println("PriorityQueue: " + queue1);

     // Peek at the head
     System.out.println("Head: " + queue1.peek());

     // Remove an element
     System.out.println("Removed: " + queue1.poll());

     // Display the queue after removal
     System.out.println("Queue after removal: " + queue1);
     
     
     
     
     
     System.out.println();
     
     ArrayDeque<String> queue3 = new ArrayDeque<String>();

     // Add elements
     queue3.offer("Apple");
     queue3.offer("Banana");
     queue3.offer("Cherry");
     queue3.add("ma");

     // Display the queue
     System.out.println("Queue: " + queue3);

     // Peek at the head
     System.out.println("Head: " + queue3.peek());

     // Remove an element
     System.out.println("Removed: " + queue3.poll());

     // Display the queue after removal
     System.out.println("Queue after removal: " + queue3);
		
	}

}
