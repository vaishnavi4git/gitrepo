package com.ifstmtexamples;

import java.util.Scanner;

/*
 * Big number from two values
 */

public class IfElseEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>y)
			System.out.println(x + " and " + y + " Big Number " + x);
		else
			System.out.println(x + " and " + y + " Big Number " + y);
	}
}
