package com.hacker.solve;

import java.util.Scanner;

public class Table {
	public static void mackTable(int no) {
		
		for (int i = 1; i <=10; i++) {
			int res=no*i;
			System.out.println(no+" x "+i+" = "+res );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        mackTable(N);
	}

}
