package com.hacker.solve;

import java.util.Scanner;

public class Sum2dArr {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        int max1=0,max2=0;
	        for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					max1+=arr[i][j]+arr[i][j+1]+arr[i][j+2]
							+arr[i+1][j+1]
						+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				}
			}
	        if(max1>max2) {
	        	max2=max1;
	        }
	        System.out.println(max2);

	    }

}