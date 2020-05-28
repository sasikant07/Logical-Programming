/*

Java program to reverse a String.


*/
package com.logical.string;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		char ch[] = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
		}
		
		System.out.println("The entered String after reversing is : ");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		
		sc.close();
	}

}
