package com.javaAssignment;
//2.Accept a bank balance from user and show the message as "Low Balance" if balance is less than 2000.
import java.util.Scanner;

public class A02_Bank_Balance_Status {

	public static void main(String[] args) {
		double balance;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your bank balance: ");
		balance=sc.nextDouble();
		if (balance<2000)
			System.out.println("Low Balance");
		sc.close();
	}

}
