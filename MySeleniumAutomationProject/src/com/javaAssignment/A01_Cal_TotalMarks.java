package com.javaAssignment;
//1.Accept marks of 5 subjects and calculate total and average marks.
import java.util.Scanner;

public class A01_Cal_TotalMarks {

	public static void main(String[] args) {
		int sub1;
		int sub2;
		int sub3;
		int sub4;
		int sub5;
		int total;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject1 marks: ");
		sub1=sc.nextInt();
		System.out.println("Enter subject2 marks: ");
		sub2=sc.nextInt();
		System.out.println("Enter subject3 marks: ");
		sub3=sc.nextInt();
		System.out.println("Enter subject4 marks: ");
		sub4=sc.nextInt();
		System.out.println("Enter subject5 marks: ");
		sub5=sc.nextInt();
		sc.close();
		total = sub1+sub2+sub3+sub4+sub5;
		avg = total/5;
		System.out.println("Total is: " +total);
		System.out.println("Average is: " +avg);
	}

}
