package com.tutorials.thirdweek;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionandIntersectionofTwoLists {

	public static void main(String[] args) {

		
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
	        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
	        
	        
	        Set<Integer>set1=new HashSet<Integer>(list1);
	        
	        Set<Integer>set2= new HashSet<Integer>(list2);
	        
	        
	        //union
	        
	        Set<Integer>union=new HashSet<Integer>(set2);
	        union.addAll(set1);
	        System.out.println("Union is : "+ union);
	        
	        
	        //intersection
	        Set<Integer>intersaction=new HashSet<Integer>(set2);
	        intersaction.retainAll(set1);
	        System.out.println("Intersaction is : "+ intersaction);
	        
		
		
	}

}
