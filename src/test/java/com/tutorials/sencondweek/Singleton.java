package com.tutorials.sencondweek;

public class Singleton {

	public static void main(String[] args) {

		/*
		 * Singleton design pattren: It ensures that a class has only one instance 
		 * 								and provides a globel point of access to it.
		 */
		
		
		SingletonDesignPattren sd=   SingletonDesignPattren.getInstance();
		SingletonDesignPattren sd1=   SingletonDesignPattren.getInstance();
		
		
		System.out.println(sd==sd1);
		
	}

}



class SingletonDesignPattren{
		static SingletonDesignPattren  ins  ;
		
		private SingletonDesignPattren() {
			
		}
		public static SingletonDesignPattren getInstance() {
			if(ins==null) {
				ins=new SingletonDesignPattren();
				System.out.println("hello");
			}
			return ins;
		}
}
