package com.apti.array;

import java.util.Scanner;

public class CyclePrint {
	static int [][] arr=new int[5][5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
		
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						arr[i][j]=sc.nextInt();
				
					}
			
			
				}
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print(arr[i][j]+"  ");
				
					}
					System.out.println();
			
			
		}

	}

}
