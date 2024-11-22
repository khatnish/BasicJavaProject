package com.tutorials.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
/*
 * In Java, streams are a powerful feature introduced in Java 8, allowing
 *  functional-style operations on collections and other data sources.
 *   A stream represents a sequence of elements and supports operations to
 *    process these elements (e.g., filtering, mapping, reducing).
 *     Streams make it easier to work with collections by providing a 
 *     declarative and expressive syntax.
 */
		
		
		
		
		List<Integer> li= Arrays.asList(1,2,3,5,6,8);
		//li.forEach(n -> System.out.println(n));        //for each mehtods
		  
		
		//using stream:
		
	/*	Stream<Integer> s1=li.stream();
		//s1.forEach(n -> System.out.println(n));
		//s1.forEach(n -> System.out.println(n));   //we can not reuse the stream it gives error(stream has already been operated upon or closed)
		
		Stream<Integer> s2 = s1.filter(n -> n%2==0);  //only even number
		//s2.forEach(n->System.out.println(n));
		
		
		Stream<Integer>s3= s2.map(n-> n*2);    //double the value using map
		//s3.forEach(n->System.out.println(n));  
		
		int result= s3.reduce(0, (c,e) ->c+e);    //reduce give an int here we get sum
		System.out.println(result);
		
		*/
		
		
		
		//this long things is in one line:
		
		int result=li.stream()
					.filter(n -> n%2==0)
					.map(n -> n*2)
					.reduce(0, (c,e)->c+e);
		
		System.out.println(result);
		
		
		//print even number using strem
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,35,6);
		// Terminal operation: collect
		List<Integer> evenNumbers = numbers.stream()
		    .filter(n -> n % 2 == 0)
		    .collect(Collectors.toList());
		System.out.println(evenNumbers); // Output: [2, 4]

		
		// Terminal operation: reduce
		int sum = numbers.stream()
		    .reduce(0, Integer::sum);
		System.out.println(sum); // Output: 51
		
		//Convert list to uppercase
		
		List<String> list = Arrays.asList("apple", "banana", "cherry");
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).toUpperCase());      //using for loop
//		}
		
		
		/* using stream*/
		
		List<String >uppercaseList= list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseList);
		
		
		
		//Grouping by Using Collectors.groupingBy:
		
		List<String> items = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
		
		Map<String, Long> mapGrouped= items.stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()));
		System.out.println(mapGrouped);
		
		
		
		/*
		 * Terminal Operations (End the stream pipeline, produce a result)
			
			forEach:	Performs an action for each element (e.g., print).
			collect:	Converts the stream into a collection (e.g., List, Set, Map).
			toArray:    Converts the stream into an array.
			reduce:  	Reduces the elements to a single value (e.g., sum, max).
			count:  	Counts the number of elements in the stream.
	findFirst/findAny:  	       Returns the first or any element (optional).
	allMatch/anyMatch/noneMatch: 	Checks if elements match a given condition.
		 * 
		 */

	}

}
