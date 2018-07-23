package com.jsp.apti;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		System.out.println("====1====");
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; rows>=col; col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		System.out.println("====2====");
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; rows+col<=n-1; col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		System.out.println("====3====");
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0; col<n; col++) {
				if(rows+col>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
			}
		System.out.println("====4====");
		for (int rows = 0; rows < n; rows++) {
			for (int col = 0;col<n; col++) {
				if(rows<=col)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			}
	}
	
}
