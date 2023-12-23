package com.ifstmtexamples;

import java.util.Scanner;

/*
 * else-if :- checking if condition in else part also
 * if(condition)
 * {
 * 	set of stmts
 * }
 * else if(condition)
 * {
 * 	set of stmts
 * }
 * ......
 * ......
 * [else
 * {
 *  set of default stmts
 * }]
 *
 * find big number from 3 numbers
 */

public class ElseIfEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y && x>z)
			System.out.println("First Number is Big");
		else if(y>x && y>z)
			System.out.println("Second Nuber is Big");
		else if(z>x && z>y)
			System.out.println("Third Number is Big");
		else
			System.out.println("Any 2 / all numbers are same");
	}

}
