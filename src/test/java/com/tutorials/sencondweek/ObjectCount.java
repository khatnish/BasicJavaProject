package com.tutorials.sencondweek;

public class ObjectCount {

	public static void main(String[] args) {

		Students.objCount();
		Students s1= new Students("nisha");
		Students.objCount();
		Students s2= new Students("nisha");
		Students s3= new Students("nisha");
		Students s4= new Students("nisha");
		Students.objCount();
	}

}

class Students{
	static int count=0;
	String name;
	public Students(String n) {
		this.name=n;
		count++;
	}
	
	public static void objCount() {
		System.out.println(count);
	}
	
}
