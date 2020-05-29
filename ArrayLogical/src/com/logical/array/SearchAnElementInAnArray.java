package com.logical.array;

import java.util.Scanner;

public class SearchAnElementInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements you want to search : ");
		int ele = sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ele) {
				System.out.println(ele+" found in the array at index "+i);
				break;
			} else {
				System.out.println("Element Not found.");
			}
		}
		
		sc.close();
	}

}
