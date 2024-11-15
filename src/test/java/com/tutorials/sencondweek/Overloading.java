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
		
		OverloadPractice o= new OverloadPractice(22,"Nisha");
//		OverloadPractice o1= new OverloadPractice(222,"nisha");
		
		o.dispaly("Khatiwada");
		o.dispaly("Khatiwada", "34 mountain ave", "07059");
		
	}
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
	
	public void dispaly(String lastName) {
		System.out.println(name + " "+lastName+ " Age:"+age);
	}
	
	public void dispaly(String lastName, String address, String zipCode) {
		System.out.println(name+ " "+ lastName + " Age: "+ age+ " "+address+ ", "+zipCode);
	}
}
