//WAP the strong no of given no
/*
 * 145=1!+4!+5
 * the given no if it is sum of factorial digit
 */
package com.jsp.apti;

public class StrongNo {
	
	static int  res=1, num=145,temp=0;
	public static int fact1(int no)
	{
			while(no>0)
		{
			res=res*no;
			no--;
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sno;
		temp=num;
		
		
		while(num>0)
		{
			sno=num%10;
			sno=sno+fact1(sno);
			num=num/10;
		}
		if(temp==res)
		{
			System.out.println("Strong no");
		}
		else
		{
			System.out.println("not");
		}

	}

}
