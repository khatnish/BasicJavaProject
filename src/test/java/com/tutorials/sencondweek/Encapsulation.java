package com.tutorials.sencondweek;

public class Encapsulation {

	public static void main(String[] args) {

		/*
		 *  Encapsulation : binding data and variables into a single unit
		 *  				typically a class(declares variables and methods are private)
		 *  				and access through controlled methods.(get and set methods)
		 */
		
		
		
		Studentssss s=new Studentssss("nisha",22);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		
		s.setName("yogesh");
		System.out.println(s.getName());
		s.setAge(23);
		System.out.println(s.getAge());
		
		
		
	}

}

class Studentssss{
	private String name;
	private int age;
	
	public Studentssss(String na, int ag) {
		this.name=na;
		this.age=ag;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
