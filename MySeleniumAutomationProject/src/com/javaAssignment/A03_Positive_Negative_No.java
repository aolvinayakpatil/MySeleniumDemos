package com.javaAssignment;
//3.Accept a number from user and check whether it is +ve or –ve
import java.util.Scanner;

public class A03_Positive_Negative_No {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		number=sc.nextInt();
		if (number>0) {
			System.out.println(number + " is positive number.");
		}else if(number<0) {
			System.out.println(number + " is negative number.");
		}else {
			System.out.println("You entered zero");			
		}		
		sc.close();
	}
}