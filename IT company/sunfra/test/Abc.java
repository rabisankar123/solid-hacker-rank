package com.sunfra.test;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int j=0;
		int k=1;
		boolean b=true;
		
		for (int i = 1; i <= n; i++) {
			if(b) {
				System.out.println(k+"/"+i);
				j++;
				
			} else  {
				System.out.println(k+"/"+i);
				j++;
				
			}
			if(j==2) {
				j=0;
				k++;
				b=!b;
			}
		}
	}
}
