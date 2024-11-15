package com.tutorials.sencondweek;

public class AbstractClass {

	public static void main(String[] args) {
		
		
		/*
		 * Abstract Class: It is declared with the keyword abstract
		 * 					we can not make object of abstract class
		 * 					serves as a blueprint for other classes
		 * 					may contain abstract methods and concrete(normal) methods
		 * 					
		 * 					used for inheritance(designed to be extended by subclass)
		 * 
		 * 
		 * 		abstract methods--> methods without body
		 * 
		 *   (Polymorphism: Abstract classes enable runtime polymorphism where
		 *    different subclasses provide their own implementation of abstract methods.)
		 */
		
		
		//  Abstraction in Java:  Achieved Using Abstract Classes and Interfaces
		
		
		
			Dog2 d= new Dog2();
			d.eat();
			d.sleep();
			d.sound();
			
			System.out.println();
			
			
			Student s= new Student("nisha","khatiwada ",12);
			s.displayName();
			s.displayRollNo();
			System.out.println(s.firstName);
	}

}

	abstract class Animal2{
		abstract void sound() ;
		
		public void eat() {
			System.out.println("Animal eats.");
		}
	}
	
	class Dog2 extends Animal2 {
	
		@Override
		void sound() {
			System.out.println("dog barks.");		
		}
		void sleep() {
			System.out.println("dog sleeps");
		}
		
	}

	
	abstract class Information{
		String firstName;
		String lastNmae;
		public Information(String firstname, String lastName) {
			this.firstName=firstname;
			this.lastNmae=lastName;
		}
		abstract public void displayName();
	}
	
	class Student extends Information{
		int rollNo;
		public Student(String firstname, String lastName, int rollNo) {
			super(firstname, lastName);
			this.rollNo=rollNo;
		}

		@Override
		public void displayName() {

			System.out.println(this.firstName+this.lastNmae);
		}
		public void displayRollNo() {
			System.out.println(rollNo);
		}
		
	}