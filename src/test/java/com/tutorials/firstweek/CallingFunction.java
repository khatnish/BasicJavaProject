package com.tutorials.firstweek;

public class CallingFunction {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		add();
		
		subtract(10, 5);
		
		
		int a  = multiply(10, 2);
		System.out.println(a);
		
		
		
		
	}
	//function without parameter and without return type
	
	public static void add() {
		System.out.println(5+5);
	}
	
	//function with parameter and without return type
	
	public static void subtract(int x,int y) {
		System.out.println(x-y);
	}
	
	//function with parameter and with return type we can store and reuse
	
	public static int multiply(int x, int y) {
		int result = x*y;
		
		return  result;
	}

}
