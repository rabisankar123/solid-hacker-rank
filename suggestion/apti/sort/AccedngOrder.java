package com.apti.sort;

import java.util.Scanner;

public class AccedngOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		System.out.println("Enter max of the array");
		int max=sc.nextInt();
		int ar[]=new int[size];
		int esum=0,osum=0;
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value "+i+" position");
			ar[i]=sc.nextInt();
		
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
			
		}
		
			System.out.println(ar[max-1]);
		
		
	}

}
