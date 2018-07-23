package com.peol.test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		int m=12;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; col <n; col++) {
				if(rows==col&&rows>=m/2&&col<m||rows+col==m&&rows>=m/2
						||col==0&&rows>m||rows==m/2&&col>m/2
						||rows==m||col==m&&rows>m
						||rows==n-1||col==n-1&&rows>m/2
						||col==4&&rows>17
						||col==8&&rows>17
						||rows==18&&4<col&&col<=8)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}

	}

}
