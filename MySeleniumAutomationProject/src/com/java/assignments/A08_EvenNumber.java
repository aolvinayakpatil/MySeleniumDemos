//Print Evene Number from Array
package com.java.assignments;

public class A08_EvenNumber {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 8, 6, 19, 22, 33, 34, 16 };
		System.out.print("Even Numbers are : ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
}
