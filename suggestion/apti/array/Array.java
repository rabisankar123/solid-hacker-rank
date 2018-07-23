package com.apti.array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of the array");
	int size=sc.nextInt();
		double ar[]=new double[5];
		System.out.println("befor initialization");
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]="+ar[i]);
			
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value "+i+" position");
			ar[i]=sc.nextDouble();
			
		}
		System.out.println("after initialization");
		for (int i = 0; i < ar.length; i++) {
			System.out.println("ar["+i+"]="+ar[i]);
		}
	}

}

