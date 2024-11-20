package com.tutorials.thirdweek;

public class ExceptionThrowKeyword {

	public static void main(String[] args) {

		/*
		 *  throw keyword is used to throw the exception and the catch block will catch that exception
		 */
		
		
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			
			if(j==0) {
				throw new ArithmeticException("I dont want to print zero");
			}
			
			
		}
		catch(ArithmeticException e) {
			j=18/1;
			System.out.println("thats the default output"+e);
		}
		catch (Exception e) {
			System.out.println("Something went wrong..."+e);
		}
		
		System.out.println(j);
		System.out.println("bye");
		
		
		
		
		
	}

}
