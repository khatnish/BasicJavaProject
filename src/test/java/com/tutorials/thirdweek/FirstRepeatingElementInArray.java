package com.tutorials.thirdweek;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElementInArray {

	public static void main(String[] args) {

		
		int []arr= {1,2,3,4,2,5,3};
		
		Set<Integer>set= new HashSet<Integer>();
		for(int num: arr) {
			if(!set.add(num)) {
				System.out.println(num);
				break;
			}
		}
	}

}
