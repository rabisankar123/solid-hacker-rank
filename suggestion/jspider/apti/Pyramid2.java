package com.jsp.apti;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for (int rows = 0; rows < n; rows++) {
			for (int space = 0; space <rows; space++) {
				System.out.print("  ");
				
			}
			for (int col = 0;2*(n-1-rows)>=col; col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}

}
