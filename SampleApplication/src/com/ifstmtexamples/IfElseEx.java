package com.ifstmtexamples;

import java.util.Scanner;

/*
 * if - else :- Based on condition true / false statements get execute
 * if(condition)
 * {
 * 	set of stmts (true)
 * }
 * else
 * {
 * 	set of stmts (false)
 * }
 * find the given number is even or odd
 */

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		int x = sc.nextInt();
		
		if(x%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}

}
