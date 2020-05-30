package com.logical.array;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Platform_Required {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arrival[] = new int[size];
		int departure[] = new int[size];
		
		System.out.println("Enter the arrival time of trains : ");
		for(int i=0;i<arrival.length;i++) {
			arrival[i] = sc.nextInt();
		}
		
		System.out.println("Enter the departure time of trains : ");
		for(int i=0;i<departure.length;i++) {
			departure[i] = sc.nextInt();
		}
		
		System.out.println("Minimum number of platforms required for the Railway Station : "+findPlatformRequired(arrival, departure, size));
		sc.close();
	}
	
	public static int findPlatformRequired(int arr[], int dep[], int n) {
		int i=0,j = 0,platform_Needed = 0, max_Platform = 0;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		while(i < n && j < n) {
			if (arr[i] < dep[j]) {
				platform_Needed++;
				i++;
				if(platform_Needed > max_Platform) {
					max_Platform = platform_Needed;
				}
			} else {
				platform_Needed--;
				j++;
			}
		}
		
		return max_Platform;
	}

}
