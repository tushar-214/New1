package com.array;

public class SearchElement {
	public static void main(String[] args) {
		int k = 88;
		boolean flag = true;
		int arr[] = { 10, 20, 30, 50, 70 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				System.out.println("its present at position =" + i);
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("Element is not present in given array");
		}
	}

}
