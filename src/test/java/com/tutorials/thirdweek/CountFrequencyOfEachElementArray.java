package com.tutorials.thirdweek;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachElementArray {

	public static void main(String[] args) {

		int []arr= {1, 2, 2, 3, 3, 3, 4,3,2,1};
		
		Map<Integer,Integer> map= new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			//System.out.println(num);
			map.put(num, map.getOrDefault(num,0)+1);  //1, 1
		}
		System.out.println(" Frequency Map : "+map);
		
		
	}

}

// key value
// 1    1
// 2    1
// 2    +1 2
//3       1
// 3    +1 2
// 3    +1 3 +1
// 4     1 
 