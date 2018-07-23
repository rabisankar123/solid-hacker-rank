package com.rob.string;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no :");
		int num=sc.nextInt();
		int count=0;
		
		for (int i = 2; i < num-1; i++) {
			if(num%i==0) {
				count++;
			}
			
			
		}
		if(count>0) {
			System.out.println("it is not Prime no.");
		} else {
			System.out.println("it is  Prime no.");
		}
	}

}
