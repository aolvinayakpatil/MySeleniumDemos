//Print 1 to 20 numbers
package com.java.assignments;

public class A09_Print1to20Numbers {

	public static void main(String[] args) {
		int [] numbers = new int[20];
		int firstNumber=1;
		System.out.print("Numbers are: ");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=firstNumber;
			firstNumber++;
			System.out.print(numbers[i]+" ");
		}

	}

}
