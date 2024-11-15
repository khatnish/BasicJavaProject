package com.tutorials.sencondweek;

public class Overriding {

	public static void main(String[] args) {

		
		/*
		 * Override : differnet class, same method name, same signature through inheritance
		 * only happens in inherited methods meaning inheritance is required
		 * 
		 * 
		 * 
		 * Override is runtime polymorphism
		 * 
		 * static and final methods are not override only overload
		 */
		
		Animal a= new Animal();
		a.sound(); 
		
		Dog d= new Dog();
		d.sound();       //over ride method calling
		
		//dynamic dispath (superclass reference subclass object)(also called upcasting)(supports runtime polymorphism)
		Animal ad= new Dog();
		ad.sound();
		
		
		Animal ac=new Cat();
		ac.sound();
		
		
	}

}

class Animal{
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
	
}
class Cat extends Animal{
	public void sound() {
		System.out.println("Cat meows");
	}
}
