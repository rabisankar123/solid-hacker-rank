package com.apti.array;
//wap to sum of even elements odd elements in a even array

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		int esum=0,osum=0;
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value "+i+" position");
			ar[i]=sc.nextInt();
		
		}
		for (int j = 0; j < ar.length; j++) {
			if(ar[j]%2==0)
			{
				esum=esum+ar[j];
			}	
			else
			{
				osum=osum+ar[j];
			}
		}
		System.out.println("Sum of even no :"+esum);
		System.out.println("Sum of odd no :"+osum);
		

	}

}
