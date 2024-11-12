package com.tutorials.firstweek;

public class Arrays {

	public static void main(String[] args) {

		/*
		 * Array: Arrays are fixed in size, index starts from 0, stores Homogeneous
		 * data, acces thorough index
		 */

		int[] num = { 1, 2, 3, 4, 5 };

		System.out.println(num[3]);

		String[] names = { "rita", "gita", "sita", "nita" };

		names[2] = "mina";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println();
		System.out.println("***sum & avg of array***");
		System.out.println();

		int n[] = { 2, 3, 5, 10 };
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		System.out.println(sum);

		int avg = sum / n.length - 1;
		System.out.println(avg);

		System.out.println();

		System.out.println("write one string and convert to character and print all character.\r\n" + "");

		System.out.println();
		String s = "warren";
		char[] s1 = s.toCharArray();

		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		System.out.println();

		// run for-each loop and print string array of 10 element.

		String[] s2 = { "warren", "bridgewater", "edition", "berkely height" };

		for (String s3 : s2) {
			System.out.println(s3);
		}

		System.out.println();
		// reverse char array

//		char[]arr= {'h','e','l','l','o'};
//		
//		for(char c:arr) {
//			System.out.println(c);

		// }

		// 2 dimensional array

		int arr1[][] = { { 10, 20, 30 } };
		for (int i = 0; i < arr1.length; i++) {
			int[] a = arr1[i];
			for (int j = 0; j < a.length; j++) {
				System.out.println(arr1[i][j]);
			}

		}

		System.out.println("******");

		int arr2[][] = new int[2][3];

		arr2[0][0] = 2;
		arr2[0][1] = 22;
		 arr2[0][2]=222;

		arr2[1][0] = 3;
		arr2[1][1] = 33;
		 arr2[1][2]=333;

//		arr2[2][0] = 4;
//		arr2[2][1] = 44;
//		arr2[2][2] = 444;

		System.out.println(arr2[1][1]);
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		
//		for(int[] aa:arr2) {
//			for(int a:aa) {
//			System.out.println(a);
//		}}
		
		
		
	}

}
