package com.tutorials.sencondweek;

public class Interface {

	public static void main(String[] args) {

		
		/*
		 * Interface : we can not create a object of interface 
		 * 				the methods are by default public and abstract
		 * 					and the variables are final and static by default
		 * 		Supports Multiple Inheritance
		 * 
		 * 			implements keyword is used
		 */
		
		
		
		BOA b= new BOA();
		b.loan();
		b.save();
		
		Chase c=new Chase();
		c.save();
		c.loan();
		
		
		System.out.println("**multiple interface implementation**");
		
		TDBank t=new TDBank();
		t.carLoan();
		t.homeLoan();
		t.loan();
		t.save();
		
		
		
	}

}


interface WorldBank{
	void save();
	void loan();
}




class BOA implements WorldBank{

	public void save() {

		System.out.println("BOA has 5% interest in saving account");
	}

	public void loan() {
		System.out.println("BOA has 7% interest in loan transaction");
	}
	
}

class Chase implements WorldBank{

	public void save() {
		System.out.println("Chase has 5% interest in saving account");
	}

	public void loan() {
		System.out.println("Chase has 7% interest in loan transaction");

	}
	
}


//class can implement mulitple interface

interface WellsFargo{
	void homeLoan();
	void carLoan();
}

class TDBank implements WorldBank, WellsFargo{

	public void homeLoan() {
		System.out.println("TDBank homeloan");
	}

	public void carLoan() {
		System.out.println("TDBank carloan");
	}

	public void save() {
		System.out.println("TDBank save");
	}

	public void loan() {
		System.out.println("TDBank loan");
	}
	
}




