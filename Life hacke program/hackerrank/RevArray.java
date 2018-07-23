package com.hacker.solve;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int d=sc.nextInt();
		int[] arr=new int[d];
		for (int i = 0; i < d; i++) {
			arr[i]=sc.nextInt();
		}
			
		for (int i = arr.length; i >=0 ; i++) {
			System.out.println(arr[i]);
		}

	}

}
