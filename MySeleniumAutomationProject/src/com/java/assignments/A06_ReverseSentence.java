//Reverse the given Sentence-"I am Sneha Patil"
//Expected output:Patil Sneha am I
package com.java.assignments;

public class A06_ReverseSentence {

	public static void main(String[] args) {
		String str = "I am Sneha Patil";
		String reverseStr[] = str.split(" ");
		System.out.print("Reverse Sentence is : ");
		for (int i = reverseStr.length - 1; i >= 0; i--) {
			System.out.print(reverseStr[i] + " ");
		}
	}
}
