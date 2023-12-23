package com.ifstmtexamples;

import java.util.Scanner;

/*
 * Simple if :- it prints statement when condition is true
 * if(condition)
 * {
 * 	set of stmts
 * }
 * find the given number is even or odd
 */

public class SimpleIfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		int x = sc.nextInt();
		
		if(x%2==0)
			System.out.println("Even Number");
		
		if(x%2!=0)
			System.out.println("Odd Number");
			
	}

}
