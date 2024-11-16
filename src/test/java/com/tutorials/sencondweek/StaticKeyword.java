package com.tutorials.sencondweek;

public class StaticKeyword {

	public static void main(String[] args) {

		Engineer e=new Engineer("Yogendra Adhikari",28);
		e.displayIndentification();
		
		
		Engineer.displayAge();
		
	}

	

}


//static keyword   ==>> we can call the methods and properties without creating the object

class Engineer {
	String fullName;
	static int age;
	static String company="Fiserv";
	
	public Engineer(String fName, int ag) {
		this.fullName=fName;
		this.age=ag;
		
	}
	
	//normal methods
	
	public  void displayIndentification() {
		System.out.println( fullName+" " +age+" "+company);
	}
	
	//static methods
	
	public static void displayAge() {
		System.out.println(age);
	}
	
	
}
