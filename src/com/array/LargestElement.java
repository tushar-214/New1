package com.array;

public class LargestElement {
	public static void main(String[] args) {
		int[] large = { 10, 100, 20, 30, 40 };

		System.out.println("original array of given");

		for (int l : large) {
			System.out.print(" " + l);

		}
		System.out.println("\n ==============================");
		int max =large[0] ;
		for (int i = 1; i < large.length; i++) {
			if (large[i] > max) {
				System.out.println(max);
				max = large[i];
			}

		}

		System.out.println("max number of given array :: ==" + max);

	}

}
