package com.tutorials.sencondweek;

public class InterfaceC {

	public static void main(String[] args) {
		
		
		//using abstract class and interface together
		
		Dd dd=new Dd("USA","warren");
		dd.one();
		dd.two();
		dd.three();
		dd.four();
		System.out.println(dd.country);
		System.out.println(dd.city);

		
	}

}


interface Aa{
	public void one();
	
}


interface Bb{
	public void two();
	
}


abstract class Cc{
	String country;
	
	public Cc(String co) {
		this.country=co;
	}
	
	abstract public void   three();
	
	public void four() {
		System.out.println("four");
	}
}


class Dd   extends Cc implements Aa, Bb{
	
	String city;

	public Dd(String co, String city) {
		super(co);
		this.city=city;
	}

	public void two() {
 System.out.println("two");		
	}

	public void one() {

		System.out.println("one");
	}

	@Override
	public void three() {
System.out.println("three");		
	}
	
}





