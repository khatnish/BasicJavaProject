package com.tutorials.thirdweek;

public class Fibonacci {

	public static void main(String[] args) {

		
		int n=7;
		int first=0;
		int second=1;
		System.out.println("Fibonacci sequence up to "+n + " terms : ");
		for(int i=0; i<n; i++) {
			System.out.print(first+" ");
			int next=first +second;
			first=second;
			second=next;
		}
		
		
	}

}
