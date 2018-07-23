package com.company.test;

import java.util.Scanner;

public class DeleteDup {
	
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of the array");
	int size=sc.nextInt();
	int ar[]=new int[size];
	for (int i = 0; i < ar.length; i++) {
		System.out.println("enter the value "+i+" position");
		ar[i]=sc.nextInt();
		
	}
	
	

}
}

