package com.apti.array;

import java.util.Scanner;

public class WholeArray {
	static Scanner sc =new Scanner(System.in);
	static int size;

	public static void main(String[] args) {
		int ar[]=null;
		// TODO Auto-generated method stub
		
		while(true)
		{
			System.out.println("1. Create Array");
			System.out.println("2. Display Array");
			System.out.println("3. Delete Element from array");
			System.out.println("4. Insert Element into array");
			System.out.println("5. Do u want to exit??");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		
		
		switch (ch) {
		case 1: System.out.println("Enter size of the array");
				size=sc.nextInt();
				ar=new int[size]; 
				ar=createArray(ar);
			break;
		case 2: displayArray(ar,size);
				System.out.println();
		break;
		case 3: System.out.println("Enter position of delete element :");
		int pos=sc.nextInt();
		deleteElement(pos,ar);
		break;
		case 4: System.out.println("Enter position to insert :");
		int pos1=sc.nextInt();
		System.out.println("Enter Element to insert :");
		int pos2=sc.nextInt();
		ar=insertElement(pos1,ar,pos2);
		break;
		case 5: System.exit(0);
		break;
		default: System.out.println("Invalid choice");
			break;
			
		}
		}
		
		
			
		

	}
	public static int[] createArray(int[] ar)
	{
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value "+i+" position");
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public static void displayArray(int []arr,int size)
	{
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] deleteElement(int pos, int[] ar) {
		// TODO Auto-generated method stub
		for (int i = pos-1; i < ar.length-1; i++) {
			ar[i]=ar[i+1];
			
		}
		size--;

		return ar;
	}
	public static int[] insertElement(int pos1, int[] ar,int ele) {
		// TODO Auto-generated method stub
		size++;
		int[] nar=new int[size];
		for (int i = 0; i < pos1-1; i++) {
			nar[i]=ar[i];
			
		}
		nar[pos1-1]=ele;
		for (int i = pos1; i < size; i++) {
			nar[i]=ar[i-1];
		}

		return nar;
	}

}
