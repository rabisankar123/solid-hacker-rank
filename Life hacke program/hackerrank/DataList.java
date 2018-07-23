package com.hacker.solve;

import java.util.ArrayList;
import java.util.Scanner;

public class DataList {
	static Scanner sc=new Scanner(System.in);
	public static void show(ArrayList al) {
		int q=sc.nextInt();
		System.out.println("Insert");
		int index=sc.nextInt();
		int insertVlaue=sc.nextInt();
		
		
		al.add(index,insertVlaue);
		System.out.println("Delete");
		int delIndex=sc.nextInt();
		for (int i = 0; i < al.size(); i++) {
			if(delIndex==i) {
				al.remove(i);
			}
		}
		for (Object object : al) {
			System.out.println(object);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		int n=sc.nextInt();
		for (int i = 0; i <n; i++) {
			al.add(sc.nextInt());
		}
		show(al);

	}

}
