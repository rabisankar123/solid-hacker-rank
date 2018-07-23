package com.jsp.apti;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; col <n; col++) {
				if(rows==0||col==0||rows==n-1
						||rows==n/2||col==n-1||col==n/2
						||rows==col||rows+col==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}

	}

}
