package com.tutorials.sencondweek;

public class Modifiers {

	public static void main(String[] args) {

		/*
		 * Modifiers : are keywords that spacify the properties and behaviors of classes,methods,variables and other elements.
		 * 
		 * --visibility of classes, methods, and variables in other parts of the code.
		 * 
		 *  **default : declarations are visible within the package 
		 *  **public : declarations are visible everywhere
		 *  **private : declarations are visible within the class only
		 *  **protected : declarations are visible within the package and all subclasses
		 *  
		 */
		
		
		
		Data d=new Data();
		//d.display method doesnot work bacause this is private and visible within the class only
		
		d.displayCity2();
		
		
		DataB db= new DataB();
		db.setName("nisha");
		db.getName();
		
		db.setName("manoj");
		String ubdate=db.getName();
		System.out.println(ubdate);
		
		
		DataC dc= new DataC(11);
		dc.displayAge();  //default method are accessible within the package
		dc.disAge();  //procted method are visible within package and sub classes
		
		
	}

}


class Data{
	
	//private
	
	private String city="warren";
	
	private void displaycity() {
		System.out.println(city);
	}
	
	public void displayCity2()
	{
		this.displaycity();
	}
	
}

class DataB{
	private String name;
	
	// set the new value
	
	public void setName(String n) {
		this.name=n;
	}
	
	// get the value from outside of class
	
	//getter
	
	public String getName() {
		return this.name;
	}
	
}

class DataC{
	int age;
	
	public DataC(int ag) {
		this.age=ag;
	}
	void displayAge() {
		System.out.println(this.age);
	}
	protected void disAge() {
		System.out.println("my age "+ this.age);
	}
}
