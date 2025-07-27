//Print the multiplication table for 8
package com.java.assignments;

public class A11_MultiplicationTable8 {

	public static void main(String[] args) {
		int number = 8;
		int result;
		System.out.println("multiplication table for 8:");
		for (int i = 1; i <= 10; i++) {
			result = number * i;
			System.out.println(number + " * " + i + " = " + result);
		}
	}
}
