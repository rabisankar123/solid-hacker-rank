package com.hacker.solve;

import java.util.Scanner;

public class Arr2dAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0;
        sum+=arr[3][2]+arr[3][3]+arr[3][4]+arr[4][3]+arr[5][2]+arr[5][3]+arr[5][4];
        System.out.println(sum);
        
        
	}

}
