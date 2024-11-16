package com.tutorials.sencondweek;


enum Laptop{
	MACBOOK(2000), XPS(2200), DELL(1000), HP;  //these are objects and parameter are in bracts
	
	private int  price;
	private Laptop() {
		this.price=100;
		System.out.println("1");
	}
	private Laptop(int price) {
		this.price=price;
		System.out.println("3");
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}



public class Enum2 {

	public static void main(String[] args) {
		
		for(Laptop lp: Laptop.values()) {
			System.out.println(lp + " : "+ lp.getPrice());
		}
		
		
		Laptop la= Laptop.HP;
		la.setPrice(600);
		System.out.println(la.getPrice());

	}

}
