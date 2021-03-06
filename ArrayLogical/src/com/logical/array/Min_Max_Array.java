/* 
 
 Java Program to Find Smallest and Largest Element in an Array.
  
 */
package com.logical.array;

import java.util.Scanner;

public class Min_Max_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		
		System.out.println("Array contents after sorting are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"] ");
		}
		
		System.out.println("\n");
		System.out.println("Smallest element in the array is : "+arr[0]);
		System.out.println("Largest element in the array is : "+arr[size-1]);
		
		
		sc.close();
	}

}
