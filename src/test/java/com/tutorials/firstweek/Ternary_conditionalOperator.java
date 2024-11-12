package com.tutorials.firstweek;

public class Ternary_conditionalOperator {

	public static void main(String[] args) {

		int a=6;
		int b= 10;
		
		int result = (a>b)?a:b;
		
		System.out.println(result);
		
		
		
		int x=101;
		int y=201;
		int z=400;
		
		
		String output= ((x>y)?"x is greater":(z>y)?"z is greater":"y is greater");
		
//		String output=x>y?"x is greater":(y>z?"y is greater":"z is greater");
		
		System.out.println(output);
	}

}
