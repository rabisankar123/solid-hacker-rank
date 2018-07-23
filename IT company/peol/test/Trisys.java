package com.peol.test;

import java.util.ArrayList;

public class Trisys {
	public static int c=20;
	static ArrayList al=new ArrayList();
	public static void addEle(int n, int k) {
		
		
		if(n>0) {
			al.add(n);
			n=n-k;
			addEle(n,k);
		}
		else {
			addEle1(n,k);
		}
		
		
	}
public static void addEle1(int n, int k) {
		
		
		if(n<=c) {
			al.add(n);
			n=n+k;
			addEle1(n,k);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addEle(20,6);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
