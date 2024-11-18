package com.tutorials.sencondweek;




enum Status{
	Running, Pending, Failed, Success;
}

public class Enum {
	
	

	public static void main(String[] args) {

		
		/*
		 * Enum : fixed set of constant values like days of the week, traffic light
		 */
		
		
		
		Status s=Status.Success;
		System.out.println(s);
		System.out.println(s.ordinal());
		
		
		
//		Status[] ss = Status.values();     //it shows all values // to print all use loop
//		System.out.println(ss[2]);
		
		
//		for(Status sss: ss) {
//			System.out.println(sss + " : "+ sss.ordinal());
//		}
		
		
		
		
		//**if else***
		
		if(s==Status.Running) {
			System.out.println("All Good");
		}
		else if(s==Status.Pending) {
			System.out.println("Please Wait");
		}
		else if(s==Status.Failed) {
			System.out.println("Try Again");
		}
		else {
			System.out.println("Done");
		}
		
		
		
		
		//*****switch case****//
		
		
		switch(s) {
		case Running : System.out.println("All Good");
		break;
		case Failed : System.out.println("Try Again");
		break;
		case Pending : System.out.println("Please Wait");
		break;
		default: System.out.println("Done");
		break;
		}
	}

}
