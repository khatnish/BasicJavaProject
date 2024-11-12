package com.tutorials.firstweek;

public class Loop {

	public static void main(String[] args) {
		
		//for loop
		//(initialization ; condition check ; increment/decrement)

		//print till 10
		
		for(int i=0; i<=10 ; i++) {
			System.out.println(i);
		}
		
		//Sum of Numbers: 
		// Use a for loop to calculate the sum of the first 100 natural numbers
		
		int n=100;
		int sum = 0;
		for(int i=0; i<=n ; i++) {
			 sum= sum+i;
			 
		}
		System.out.println(sum);
		
		//Even Numbers: 
		//Write a for loop that prints all even numbers between 1 and 50.
		
		int num=50;
		for(int i=1; i<=num; i++) {
			//System.out.println(i);
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		//Multiplication Table: 
		/*Create a program that uses a for loop to print the multiplication
		table for a given number (e.g., 5).*/
		
		int numb=5;
		for(int i=1; i<=10; i++) {
			int result=numb*i;
			System.out.println(numb + " x " + i + " = " + result);
		}
		
		
		//while loop
		
		//prints numbers from 1 to 5:
		int i=0;
		
		while( i<5) {
			i++;
			System.out.println(i);
			
			
		}
		
		System.out.println("even number while loop");
		
		//Print Even Numbers from 2 to 20
		
		int i1=2;
		while(i1<=20) {
			if(i1%2==0) {
				
				System.out.println(i1);
			
			}
			i1++;
			
		}
		
		System.out.println("Sum of Natural Numbers 100");
		
		int i2=1;
		int sum1=0;
		while(i2<=100) {
			sum1=i2+sum1;
			i2++;
		}
		System.out.println(sum1);
		
		
		System.out.println("Reverse a Number");
		
		int number=12345;
		int reverse=0;
		while(number !=0) {
			int digit= number%10;//5  4
			reverse=reverse*10+digit; //0*10 + 5,  5*10 +4
			number=number/10;   //remove last digit from number
		}
		System.out.println(reverse);
		
		
		
		
	}

}
