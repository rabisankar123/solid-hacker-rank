package com.hacker.solve;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayListDemo implements Comparator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		ArrayList<ArrayList> al=new ArrayList<ArrayList>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> al1=new ArrayList<Integer>();
			for (int j = 0; j < d; j++) {
				al1.add(sc.nextInt());
			}
			al.add(al1);
		}
		int q=sc.nextInt();
		for (int i = 0; i < q; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			ArrayList<ArrayList> al3=al.get(x);
			if(al3.size()>y) {
				System.out.println(al3.get(y));
			} else {
				System.out.println("ERROR!");
			}
			
		}
		
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		return 0;
		
	}

}
