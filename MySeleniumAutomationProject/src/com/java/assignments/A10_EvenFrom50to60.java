//Print Even Numbers from 50 to 60
package com.java.assignments;

public class A10_EvenFrom50to60 {

	public static void main1(String[] args) {
		int[] numbers = { 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 };
		System.out.print("Even Numbers are: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] num = new int[10];
		int initialnum = 50;
		for (int i = 0; i < num.length; i++) {
			num[i] = initialnum;
			initialnum++;
			if (initialnum % 2 == 0) {
				System.out.println(+initialnum);
			}
		}
	}
}