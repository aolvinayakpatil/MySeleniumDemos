package com.java.assignments;

public class A12_FactorialTill5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			int factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;

			}
			System.out.println("Factorial of " + i + " is: " + factorial);
		}

	}

}
