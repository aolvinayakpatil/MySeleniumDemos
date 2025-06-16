package com.javaAssignment;
/*4.Accept selling amount and purchase amount from user and display whether it is profit or loss
and how much?*/
import java.util.Scanner;

public class A04_Profit_Loss {

	public static void main(String[] args) {
		int purchaseAmt;
		int sellAmt;
		int profirOrLoss;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Purchase Amount: ");
		purchaseAmt=sc.nextInt();
		System.out.println("Enter Selling Amount: ");
		sellAmt=sc.nextInt();
		profirOrLoss = sellAmt - purchaseAmt;
		if(profirOrLoss > 0) {
			System.out.println("Your are in profit with " + profirOrLoss + " Rs");
		}else {
			System.out.println("You are in loss with " + Math.abs(profirOrLoss) + " Rs");
		}
		sc.close();
	}

}
