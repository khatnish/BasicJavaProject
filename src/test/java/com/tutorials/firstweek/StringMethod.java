package com.tutorials.firstweek;

public class StringMethod {

	public static void main(String[] args) {

		System.out.println("String : ");
		System.out.println("String is an object that represents the sequence" + " of characters. ");
		System.out.println("In java string is immutable that means " + " once the String object is created it's"
				+ " value can't be change");

		// 2 ways to create String

		System.out.println("1st: String Literal");

		String str = "Hello World"; // String pool to store it.If another string with the same value exists, Java
									// will point to the same object in the pool.

		System.out.println("2st: Using new keyword");

		String str2 = new String("Hello World"); // This creates a new String object in the heap memory, even if the
													// same value exists in the string pool.
		System.out.println();
		System.out.println("**** Methods ****");

		System.out.println();

		String firstName = "Nisha ";
		String lastName = "Khatiwada";

		System.out.println(firstName.concat(lastName));
		System.out.println(firstName.charAt(2));
		System.out.println(firstName.contains("h"));
		System.out.println(lastName.replace("t", "P"));

		System.out.println(lastName);

		System.out.println(lastName.length());
		System.out.println(lastName.startsWith("K"));
		System.out.println(firstName.endsWith("a"));

		System.out.println(lastName.substring(2, 5));
		System.out.println(firstName.equals(lastName));
		System.out.println(firstName.toUpperCase());
		System.out.println(lastName.toLowerCase());
		System.out.println(firstName.length());
		firstName = firstName.trim();
		System.out.println(firstName.length());

		/*
		 * String is immutable, meaning once the string object is created the value
		 * can't be changed so concat(), replace() function create another string object
		 * instead of altering the previous string
		 */

		String original = "Java ";
		String modified = original.concat("Programming");

		System.out.println(original);
		System.out.println(modified);

		// using StringBuilder and StringBuffer

		System.out.println();
		System.out.println("***StringBuffer***");
		System.out.println();

		StringBuffer sb = new StringBuffer("nisha");
		System.out.println(sb);    //StringBuffer is mutable check line 73
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" miss"));
		System.out.println(sb);    //It updates the previous value
		
		//System.out.println(sb.deleteCharAt(2));
		
		
		
		String s= sb.toString();
		System.out.println(s);
		
		
		/* String 					   StringBuffer 		StringBuilder 
		 * 	immutable					mutable				mutable
		 *   thread safe	 	 thread safe		 is not thread safe
		 *  is not synchonozid 		 synchonozid  	     is not synchonized
		 *   */
		
		//print character and reverse it
		String one= "Khatiwada";
		char []two;
		for(int i=0; i<one.length();i++) {
			System.out.println(one.charAt(i));
			
		}
		System.out.println("****reverse****");
		for(int i=one.length()-1; i>=0; i--) {
			System.out.println(one.charAt(i));
		}
		
		
		//print vowel letter only
		
		System.out.println("print vowel letter only");
		
		String place= "New Jersey";
		int countt = 0;
		for(int i=0; i<place.length(); i++) {
			if(place.charAt(i)=='a'||place.charAt(i)=='e'||place.charAt(i)=='i'||place.charAt(i)=='o'||place.charAt(i)=='u') {
				System.out.println(place.charAt(i));
				
				countt++;
			}
			
		}
		System.out.println(countt);
		
		System.out.println(place.indexOf("Jersey"));

	}

}
