package com.jsp.apti;

import java.util.Scanner;

public class PerfectNo1_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int j = 1; j < 1000; j++) {
			
		int sum=0;
		for (int i = 1; i < j/2; i++) {
			
			if(j%i==0)
			{
				sum=sum+i;
			}
		}
			if(j==sum)
			{
				System.out.println(j);
			}
		
		}
		
	}

}
