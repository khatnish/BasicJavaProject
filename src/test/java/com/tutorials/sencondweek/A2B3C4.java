package com.tutorials.sencondweek;

public class A2B3C4 {
//7a721691c9f111abe0a775cfd8f660df3a13fb82 
	public static void main(String[] args) {

		String s= "a2b3c4";
		for(int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			
			//System.out.println(c);
			
			if(Character.isDigit(c)) {
				int digit= Character.getNumericValue(c);
				//System.out.println(digit);
				//System.out.println(s.charAt(i-1));
				for(int j=0; j<digit; j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
	}

}

//this is the comment from eclipse
