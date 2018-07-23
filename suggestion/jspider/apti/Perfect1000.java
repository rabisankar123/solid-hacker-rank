package com.jsp.apti;

public class Perfect1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for (int a = 1; a < 100; a++) {
			int sum=0;
			for (int i = 1; i <a/2; i++) {
				if(a%i==0)
				{
					sum=sum+i;
				}
				
			}
			if(a==sum)
			{
				System.out.println(a);
			}
			
		}

	}

}
