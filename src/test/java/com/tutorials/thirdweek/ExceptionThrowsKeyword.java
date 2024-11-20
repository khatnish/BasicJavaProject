package com.tutorials.thirdweek;

public class ExceptionThrowsKeyword {

	public static void main(String[] args) {
		
		
/*
 * throws                                                throw
declares exception that a method can throw.       used to actually throw an exception in code.
placed in the method signature				placed within the method body
used for checked exception			can be used for both checked & unchecked exception
eg:public void method()throws IOException		throw new IOException("Error occurred")
 */
		 

		A obj=new A();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			System.out.println("Not able to find the class");
			e.printStackTrace();
		}
		
		
		
	}

}


class A{
	public void show() throws ClassNotFoundException {
		Class.forName("ABC");
	}
}
