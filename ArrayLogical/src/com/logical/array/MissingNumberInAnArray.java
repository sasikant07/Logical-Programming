package com.logical.array;

import java.util.Scanner;

public class MissingNumberInAnArray {

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
		
		System.out.println("Missing number from array array: "+missingNumber(arr));
		
		sc.close();
	}
	
	public static int missingNumber(int[] arr)
	{
		// Ensure that n is at the last index
		if (arr[arr.length-1] != arr.length) {
            return arr.length;
        }
        // Ensure that 0 is at the first index
        else if (arr[0] != 0) {
            return 0;
        }

        // If we get here, then the missing number is on the range (0, n)
        for (int i = 1; i < arr.length; i++) {
            int expectedNum = arr[i-1] + 1;
            if (arr[i] != expectedNum) {
                return expectedNum;
            }
        }

        // Array was not missing any numbers
        return -1;
	}
	
	/* public static int missingNumber(int[] arr) {
        int sum = 0 ;
			for( int ele : arr ) 
				sum += ele ;
			return ( ( arr.length * ( arr.length + 1 ) / 2 ) - sum ) ;
    } */
	
	/*
	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int rem = 0;
		
		for (int i = 0; i < arr.length; i++) {
			rem += arr[i];
		}
		int missingNumber = sum - rem;
		return missingNumber; 
	}
	
	*/
}
