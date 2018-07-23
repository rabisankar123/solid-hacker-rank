package com.sunfra.test;

public class Series {

	public static void main(String[] args) {
		int n=13;
		for (int i = 1; i < n; i++) {
			int k=i+3;
			while(i<=k) {
				if(i<k-1) {
					System.out.println(i);
				} else if(i<=k) {
					int j=i;
					System.out.println(j*j);
				}
				i++;
				
			}
			i--;
			
		}

	}

}
