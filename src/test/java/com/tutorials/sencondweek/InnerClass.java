package com.tutorials.sencondweek;

public class InnerClass {

	public static void main(String[] args) {
		
		Fruits f= new Fruits("red");
		Fruits.Apple  a= f.new Apple();
		a.displayColor();
		
	}

}


class Fruits{
	String color;
	
	public Fruits(String co){
		this.color=co;
		
	}
	
	class Apple{
		
		
		public void displayColor() {
			System.out.println(color);
		}
	}
}