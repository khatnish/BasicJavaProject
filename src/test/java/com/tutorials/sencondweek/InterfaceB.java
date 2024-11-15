package com.tutorials.sencondweek;

public class InterfaceB {

	public static void main(String[] args) {
		
		
		D d   =new D();
		d.one();
		d.two();
		d.three();
		d.four();
		d.five();
		d.six();

	}

}





interface A{
	void one();
	void two();
}

interface B{
	void three();
	void four();
}

interface C extends A,B{
	void five();
	void six();
}


class D implements C{

	public void one() {
System.out.println("one");		
	}

	public void two() {
		System.out.println("two");		
		
	}

	public void three() {
		System.out.println("three");		
		
	}

	public void four() {
		System.out.println("four");		
		
	}

	public void five() {
		System.out.println("five");		
		
	}

	public void six() {
		System.out.println("six");		
		
	}
	
}
