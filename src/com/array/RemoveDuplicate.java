package com.array;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 10, 20 };
		int arr1[];

		System.out.println("remove duplicate ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				} else {

					arr1 = new int[arr.length - count];
					for (int k = 0; k < arr.length-count; k++) {
						arr1[k] = arr[i];
						
					}
				}
			}
		}
		
	
			
		
		

	}
}
