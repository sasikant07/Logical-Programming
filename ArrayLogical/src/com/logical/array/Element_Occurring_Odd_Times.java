/*
	Find the number occurring odd number of times in an array
*/
package com.logical.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Element_Occurring_Odd_Times {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The element which occur odd number of times : "+elementOccurringOddTimes(arr));
		
		
		sc.close();
	}

	public static int elementOccurringOddTimes(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int newValue = arr[i];
			
			if(map.get(newValue) == null) {
				map.put(newValue, 1);
			} else {
				map.put(newValue, map.get(newValue)+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() % 2 == 1) {
				return entry.getKey();
			}
		}
		
		return -1;
	}

}
