package com.tutorials.thirdweek;

public class Exceptions {

	public static void main(String[] args) {

		
			/*
			 	* Exception : An exception in java is an unexpected event or error that occurs during the 
		 * 				execution of a program.
		 * 
		 * 				(runtime errors)
		 * 
		 * 				Exception disrupts the normal flow of program and java provides the mechanism to handle
		 * 				 these situations gracefully, ensuring that the program can recover or terminate
		 * 					gracefully.
		 * 
		 * 
		 * 	All exception are subclass of the Throwable class
		 * 	the Throwable class has 2 main branches:
		 * 	    1. Error : Represents serious issues that cannot typically be handled
		 * 						 by the program (e.g., OutOfMemoryError, StackOverflowError).
		 * 							
		 * 		2. Exception: Represents conditions that can be handled by the program.
		 * 					subdivided into:
		 * 			i) Checked Exception(Must be handled at compile-time (e.g., IOException, SQLException).)
	 * 				ii) Unchecked Exceptions : Runtime exception e.g. NullPointerException, ArithmeticException
	 * 				iii) user defined 
	 */
		
		
	/*
	 *  Handling Exceptions in Java:
	 *  	1. try-catch Block	
	 *  	2. finally Block (allows execute whether or not an exception occurs)
	 *  	3. throws Keyword(If a method might throw a checked exception, it must declare
	 *  						 this using the throws keyword)
	 *  	
	 */
		
		
		
		
		
//		int i=4;
//		int j=0;
//		try {
//			j=i/j;       //try is a block to write a code that may throw an exception
//		}
//		catch(Exception e) {
//			System.out.println("Something went wrong...");  //code to handle the exception
//			//e.printStackTrace();    //to check the exception
//			System.out.println(e.getMessage());  //to check the message
//			
//		}
//		System.out.println(j);
//		System.out.println("bye");
		
		
		System.out.println();
		
		
		String firstName=null;
		int arr[]=new int[5];
		
		//System.out.println(firstName);
		
		try {
			//System.out.println(firstName.charAt(0));
			System.out.println(arr[1]);
			System.out.println(arr[5]);
		}
		catch(NullPointerException e) {
			System.out.println("Please initialize the value");
		}
		catch(Exception e) {
			System.out.println("Exception handled");
			e.printStackTrace();
		}
		
//		finally {
//			System.out.println("This block will always execute whether or not exception occurs");
//		}
		
		
		
		/*
		 * runtime exception are unchecked exception:
		 * 		Arithmetic exception
		 * 		Null pointer exception
		 * 		Array index out of bound exception
		 */
		
		
		/*
		 *  complile time exception are checked exception which are forced to correct or handle on compile
		 *  time they are
		 *    sql exception
		 *    IOexception (need to use throws while writing...)
		 */
		
		
	}

}
