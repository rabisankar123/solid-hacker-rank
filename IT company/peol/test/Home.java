package com.peol.test;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if(row==0&&col>2||row==n-1||col==0&&row>3
						||col==n-1||col==6&&row>3||row==3
						||row==1&&col==2||row==2&&col==1
						||row==1&&col==4||row==2&&col==5||col==2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}

}
