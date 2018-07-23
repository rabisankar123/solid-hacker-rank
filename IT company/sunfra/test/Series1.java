package com.sunfra.test;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int j=0;
		boolean b=true;
		
		for (int i = 1; i <= n; i++) {
			if(b) {
				System.out.println(i);
				j++;
			} else  {
				System.out.println(i*i);
				j++;
			}
			if(j==2) {
				j=0;
				b=!b;
			}
		}
	}

}
