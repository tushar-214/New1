package com.array;

public class PrimeNumber {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Reset count for each number
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            // If the number has exactly 2 divisors, it is prime
            if (count == 2) {
                System.out.println("Prime number = " + arr[i]);
            }
        }
    }
}
