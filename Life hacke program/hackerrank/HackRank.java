package com.hacker.solve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HackRank {
	public static int createExp(int n1, int n2) {
		if(n1>0&&n2>0) {
		return n1/n2;
		} else if(n2==0) {
			throw new ArithmeticException("/ by 0");
		}else {
			return 0;
		}
		
		
	}
	public static int createExp(double n1, int n2) {
		throw new InputMismatchException();
	}
	public static int createExp(String n1, int n2) {
		throw new InputMismatchException();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		int n1=Integer.parseInt(st1);
		int n2=Integer.parseInt(st1);
		System.out.println(createExp(n1,n2));
		
		
	}

}
