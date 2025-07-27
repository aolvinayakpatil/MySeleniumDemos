package com.java.assignments;

public class OddNumbers {

	public static void main(String[] args) {
		int []oddNumbers=new int[20];
		int index=0;
		for (int i=1;i<=40;i++) {
			if(i%2!=0) {
				oddNumbers[index]=i;
				index++;
			}
		}
		System.out.println("Odd Numbers:");
		for(int i=0;i<oddNumbers.length;i++) {
			System.out.println(oddNumbers[i]);
		}
	}

}
