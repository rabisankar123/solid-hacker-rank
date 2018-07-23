package com.hacker.solve;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int i=1;
        while (sc.hasNext()) {
        	String s=sc.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
	}

}
