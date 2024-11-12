package com.tutorials.sencondweek;

public class Day1UserdefinedDatatype {

	public static void main(String[] args) {
		Human h=new Human("nisha",22);
		h.walk();
		h.talk();
		
		
		
		
		System.out.println();
		
		
		Vehicle v = new Vehicle("blue",2022);
		v.displayColor();
		
		
		
		System.out.println();
		
		
		Person p1= new Person("ram","adhikari",27);
		
		
		System.out.println(p1.fname);
		
		Person p2= new Person("raju","ghimire",55);
		
		Person p3= new Person("rajan","purbe",25);
		p1.display();
		p2.display();
		
		
		System.out.println("*******");
		Person names[]= {p1,p2,p3};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i].fname);
			names[i].display();
		}
		
		

	}

}



 class Human{
	String name;
	int age;
	
	public Human(String nm, int ag) {
		this.name=nm;
		this.age=ag;
	}
	public void walk() {
		System.out.println(name+" can walk");
	}
	public void talk() {
		System.out.println(name + " is "+ age + " years old and can talk in english properly.");
	}
	
}
 
 
 
 class Vehicle{
	 private String color;
	 int model;
	 
	 public Vehicle(String co, int mo) {
		 this.color=co;
		 this.model=mo;
	 }
	 
	 public void displayColor() {
		 System.out.println(this.color);
	 }
	 
 }
 
 
 class Person{
	 String fname;
	 String lname;
	 int age;
	 public Person(String fn, String ln, int ag) {
		 this.fname=fn;
		 this.lname=ln;
		 this.age=ag;
	 }
	 public void display() {
		 System.out.println(this.fname+ " "+this.lname + " "+ this.age);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
 }
