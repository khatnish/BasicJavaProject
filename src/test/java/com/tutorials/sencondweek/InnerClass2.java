package com.tutorials.sencondweek;

public class InnerClass2 {

	public static void main(String[] args) {
		
		Car c=new Car("red","SUV");
		Car.TypeEngine te=c.new TypeEngine();
		String s = te.Size();	
		System.out.println(s);

		
	}

}





class Car{
	String color;
	String type;
	
	public Car(String co, String ty) {
		this.color=co;
		this.type=ty;
	}
		
		class TypeEngine{
			String engine;
			
			public String Size() {
				if(Car.this.type.equals("SUV")) {
					this.engine="bigger";
				}
				else if(Car.this.type.equals("sedane")) {
					this.engine="small";
				}
				return engine;
			}
			
		}
}
