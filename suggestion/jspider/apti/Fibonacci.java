// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
package com.jsp.apti;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,k;
		
		System.out.println(i);
		System.out.println(j);
		for(int m=0;m<30;m++)
		{
		
		k=i+j;
		i=j;
		j=k;
		System.out.println(k);
		}
		

	}

}
