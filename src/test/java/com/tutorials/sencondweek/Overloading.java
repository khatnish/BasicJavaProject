package com.tutorials.sencondweek;

public class Overloading {

	public static void main(String[] args) {

		
		/*
		 * overloading : same class, same method name , different signature
		 * 
		 * main method overload ? : yes (create additional main methods with different parameter lists)
		 * constuctor overload ? : yes 
		 * 
		 * 
		 * overloading is complile time polymorphism
		 * 
		 * 
		 * static and final methods are not override only overload
		 */   
		
		OverloadPractice o= new OverloadPractice(22);
		OverloadPractice o1= new OverloadPractice(222);
		
		o.dispaly("nisha");
		o1.dispaly("yogesh", 30);
		
	}
	
	



class OverloadPractice{
	String name;
	int age;
	public OverloadPractice(int age) {
		this.age=age;
	}
	public OverloadPractice(int age, String name) {
		this.name=name;
		this.age=age;
	}
	
	public void dispaly(String lname) {
		System.out.println(this.name+ " "+ lname);
	}
	
	public void dispaly(String lname, int age) {
		System.out.println(this.name+ " "+ lname + " "+ age);
	}
}
