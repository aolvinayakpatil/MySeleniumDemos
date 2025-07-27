//Find the largest number from given array
package com.java.assignments;

public class A05_LargestNumberFromArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 9, 20, 236, 563, 123 };
		int largestnum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestnum) {
				largestnum = numbers[i];
			}
		}
		System.out.println("Largest Number is : " + largestnum);
	}
}
