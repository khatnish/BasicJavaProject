package com.tutorials.thirdweek;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ReverseList {

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(1,2,3,4,5);
		Collections.reverse(list);
		System.out.println(" Reversed list : "+list);
		
	}

}
