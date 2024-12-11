package com.array;

public class SumOfArrayAVG {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 50, 70 };
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println("sum of Array is =" + sum);
		System.out.println("Average of Array is =" + sum / arr.length);
	}
}
