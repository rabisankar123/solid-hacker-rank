package com.rob.matrix;

import java.util.Scanner;

public class TowDmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][] arr=new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j]=sc.nextInt();			}
			
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print(arr[i][j]);	
			}
			System.out.println();
			
		}

	}

}
