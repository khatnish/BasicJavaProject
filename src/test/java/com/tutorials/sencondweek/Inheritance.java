package com.tutorials.sencondweek;

public class Inheritance {

	public static void main(String[] args) {

		/*
		 * Inheritance : is a core concept of Object Oriented Programming which allows
		 * 					one class to inherit or accquire the properties and methods of another class.
		 * 				: acheived through extends keyword 
		 * 				: subclass or derived class inherit superclass or base class properties
		 * 				 and behaviours.
		 * 				 : super keyword is used
		 * 					to refer superclass and it's properties and methods
		 * 
		 * 				: protected methods in parent class are accessible in child class even if
		 *					 they are in different package
		 * 
		 * 
		 * **types**
		 * 
		 * 		1. Single Inheritance : A class inherits from one superclass.
		 * 	 	2. Multilevel Inheritance : A class inherits from superclass and another class inherits
		 * 									that class.
		 *  	3. Hierarchical Inheritance : Multiple classes inherit from same superclass.
		 * 
		 * 		4. Multiple Inheritance : class inherit from multiple classes(Java does not
		 * 									support multiple inheritance but it can be achieved through interfaces.)
		 */
		
		
		
		Father f= new Father("Khatiwada","Om");
		System.out.println(f.lastName);
		System.out.println(f.firstName);
		f.displayFullName();
		f.displayLastname();
		
		
		
		
		
		//multilevel
		
		System.out.println();
		
		Son s= new Son("Khatiwada", "Manoj",24);
		System.out.println(s.firstName);
		s.displayFullName();
		s.displayLastname();
		s.displayAge();
		
		
		//Hierarchical Inheritance
		Daughter d= new Daughter("Adhikari","Nisha");
		d.displayFullName();
		d.displayLastname();

	}

}

class GrandFather {
	String lastName;

	public GrandFather(String ln) {
		this.lastName = ln;
	}

	public void displayLastname() {
		System.out.println(this.lastName);
	}
}

// single inheritance

class Father extends GrandFather {
 String firstName;
	public Father(String ln, String fn) {
		super(ln);
		this.firstName=fn;
	}
	
	public void displayFullName() {
		System.out.println(this.firstName+ " "+ this.lastName);
	}
	
	
}

//mutilevel inheritance

class Son extends Father{
	
	int age;

	public Son(String ln, String fn, int ag) {
		super(ln, fn);
		this.age=ag;
	}
	
	public void displayFullName() {					//override mehtod
		System.out.println("My full name is "+this.firstName+ " "+ this.lastName);
	}
	
	public void displayAge() {
		System.out.println(this.age);
	}
	
}


//Hierarchical inheritance

class Daughter extends Father{

	public Daughter(String ln, String fn) {
		super(ln, fn);
		
	}
	public void displayFullName() {
		System.out.println(this.firstName+this.lastName);
		
	}
	
}
