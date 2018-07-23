package com.jsp.apti;

public class FiboRe {
	static int n1=0;
	static int n2=1;
	static int n3=0;
	
	
	public static void fibo(int count)
	{
		if(count>0)
		{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
		fibo(count-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		System.out.println(n1);
		System.out.println(n2);
		fibo(count);

	}

}
