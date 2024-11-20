package com.tutorials.thirdweek;




class NishaException extends Exception{		//user defined exception need to extends Exception class 
												//or RuntimeException to use methods
	public NishaException(String str) {		//to print the message make a constructor using super keyword 
		super(str);
	}
}

public class ExceptionUserDefinedorCustomandThrow {

	public static void main(String[] args) {

		
		int  i=20;
		int j=0;
		
		
		try {
			j=18/i;
			
			if(j==0) {
				throw new NishaException("I dont want to print zero");  //this is parameter for constructor
			}
		}
		catch(NishaException e){
			j=18/1;
			System.out.println("  This is Default value "+e);
			
		}
		catch (Exception e) {
			System.out.println("something went wrong....."+e);
		}
		
		System.out.println(j);
		System.out.println("bye");
		
		
	}

}
