//WAP to calculate factorial of given no using recursion
package com.jsp.apti;
import java.util.Scanner;

public class Fact {
	static int res=1;
	
	
	public static void fact1(int no)
	{
		if(no>0)
		{
			res=res*no;
			fact1(no-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no;
		System.out.println("Enter no.");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		fact1(no);
		System.out.println(res);
	}

}
