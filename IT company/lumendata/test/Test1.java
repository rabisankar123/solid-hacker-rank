package com.lumendata.test;

public class Test1 {

	public static void main(String[] args) {
		int i=0;
		while(i<3) {
			if(i++==0)System.out.print("Merry");
			if(i==1)System.out.print("Merr");
			if(++i==2)System.out.print("Mer");
			else System.out.print("Oh!");
		}
		int n=30;
		if(n/10%10==3)
			{System.out.println("Bingo");
			
			}
	}
}
