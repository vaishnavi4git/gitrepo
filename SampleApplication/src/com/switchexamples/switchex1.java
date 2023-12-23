package com.switchexamples;
import java.util.Scanner;

public class switchex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. India\n2. Canada\n3. Austrlia");
		System.out.println("Pick Ur Choice : ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1: 
			System.out.println("Interested to Study in India");
			break;
		case 2: 
			System.out.println("Interested to Study in Canada");
			break;
		case 3: 
			System.out.println("Interested to Study in Austriala");
			break;
		default:
			System.out.println("Invalid Option");
		}
	}

}
