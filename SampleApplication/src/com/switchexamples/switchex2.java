package com.switchexamples;
import java.util.Scanner;
// Accept month number then find no of days in that month
public class switchex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number : ");
		int mno = sc.nextInt();
		
		switch(mno)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("Month Having 31 days");
			break;
		case 2: 
			System.out.println("Month having 28/29 days");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("Month having 30 days");
			break;
		default:
			System.out.println("Invalid Month Number");
		}
	}
}
