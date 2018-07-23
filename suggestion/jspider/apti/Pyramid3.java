package com.jsp.apti;

public class Pyramid3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for (int rows = 0; rows < n; rows++) {
			int count=0;
			for (int space = 0; space <(n-1-rows); space++) {
				System.out.print("  ");
				
			}
			for (int col = 0;2*rows>=col; col++) {
				if(col<=rows)
				System.out.print(++count+" ");						
				else					
					System.out.print(--count+" ");
			}
			System.out.println();
			
			}

	}

}
