package com.tutorials.sencondweek;

public class InterfaceC {

	public static void main(String[] args) {
		
		
		//using abstract class and interface together 
		
		Dd dd=new Dd("USA","warren");
		dd.one();
		dd.two();
		dd.two(10);
		dd.three();
		dd.four();
		System.out.println(dd.country);
		System.out.println(dd.city);
		
		
		
		
		//interface has variables too which are static and final 
		System.out.println(dd.n);

		
	}

}


interface Aa{
	 int n = 30;         //final so that need to innilized
	public void one();
	
}


interface Bb{
	public void two();
	
	public void two(int x);     //method overload is possible 
	
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

	public void two(int x) {
System.out.println(x);		
	}
	
}





