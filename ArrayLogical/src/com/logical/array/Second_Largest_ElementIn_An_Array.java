package com.logical.array;

import java.util.Scanner;

public class Second_Largest_ElementIn_An_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array contents are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"] ");
		}
		System.out.println("\n");
		
		/* for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];								// time complexity O(n^2) 
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Array contents after sorting are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"] ");
		}
		
		System.out.println("The secomd largest number in the array is : "+arr[size - 2]);  */
		
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if(arr[i] > highest && arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		
		System.out.println("The second highest number in the array is : "+secondHighest);
		
		
		sc.close();
	}

}
