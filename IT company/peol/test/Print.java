package com.peol.test;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for (int rows = 0; rows <= n; rows++) {
			int count=0;
			for (int col = 0; col <= rows; col++) {
				count=count+rows+1;
				System.out.print(" "+count);
			}
			
			System.out.println();
		}
		for (int rows = n-1; rows >=0; rows--) {
			int count=0;
			for (int col = 0; col <= rows; col++) {
				count=count+rows+1;
				System.out.print(" "+count);
			}
			
			System.out.println();
		}
		
	}

}
