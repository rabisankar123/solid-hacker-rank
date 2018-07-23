package com.hacker.solve;

import java.util.ArrayList;
import java.util.Scanner;

public class DupString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			al.add(sc.next());
		}
		int q=sc.nextInt();
		ArrayList<String> al1=new ArrayList<String>();
		for (int i = 0; i < q; i++) {
			al1.add(sc.next());
		}
		for (int i = 0; i < q; i++) {
			String str=al1.get(i);
			int count=0;
			for (int j = 0; j < n; j++) {
				String res=al.get(j);
				if(res.equals(str)) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}
