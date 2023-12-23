package com.ifstmtexamples;

import java.util.Scanner;

/*
 * Nested if :- A if condition within another if condition without else part
 * if(condition)
 * {
 * 		if(condition)
 * 		{
 * 			set of stmts
 * 		}
 * }
 * find the Eligibilty of marriage of the person based on gender and age
 * Male -  Age is >=21 :-  Eligiable
 * Female - Age is >=18 :- Eligiable
 */

/*
 * == operator checks for only numbers, it won't work for Strings
 * for strings, we have equals() method is used
 */

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender of the Person(Male/Female)");
		String sgen = sc.next();
		if(sgen.equals("Male") || sgen.equals("Female"))
		{
			System.out.println("Enter age of the person : ");
			int age =sc.nextInt();
			if(sgen.equals("Male"))
			{
				if(age>=21)
					System.out.println("Eligible for  Marriage ");
				else
					System.out.println("Not Eligible for  Marriage ");
			}
			
			if(sgen.equals("Female"))
			{
				if(age>=18)
					System.out.println("Eligible for  Marriage ");
				else
					System.out.println("Not Eligible for  Marriage ");
			}
		}
		else
			System.out.println("Invalid Gender");
	}
}
