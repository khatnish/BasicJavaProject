package com.tutorials.firstweek;

public class ConditionalStatement {

	public static void main(String[] args) {

		//if
		
		int a=10;
		int b=2;
		if(a>=b) {
			System.out.println("a is greater");
		}
		
		//if else
		
		if(a<=b) {
			System.out.println("a smaller");
		}
		else {
			System.out.println("b smaller");
		}
		
		
		//else if
		
		int marks=39;
		if(marks>=80) {
			System.out.println("A+");
		}
		else if(marks>=60) {
			System.out.println("A");
		}
		else if(marks>=40) {
			System.out.println("B+");
		}
		else if(marks>=30) {
			System.out.println("B");
		}
		else {
			System.out.println("fail");
		}
		
		
		//switch case
		
		int day=40;
		
		switch (day) {
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		default:System.out.println("invalid");
		}
	}

}
