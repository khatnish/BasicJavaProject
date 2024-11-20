package com.tutorials.thirdweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatefromList {

	public static void main(String[] args) {

		List <Integer> list= Arrays.asList(1,22,3,22,8,4,8);
		System.out.println(list);
		
		Set<Integer> set=new HashSet<Integer>(list);
		//System.out.println(set);
		
		List<Integer> uniqueList=new ArrayList<Integer>(set);
		System.out.println("List without duplicaties : "+uniqueList);
		
		
	}

}
