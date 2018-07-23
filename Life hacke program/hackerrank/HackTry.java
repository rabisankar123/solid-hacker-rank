package com.hacker.solve;

import java.util.*;

public class HackTry {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			if(n2==0) {
				new ArithmeticException("/ by zero");
			} else {
				System.out.println(n1/n2);
			}
			
		} catch (InputMismatchException  e) {
			System.out.println(e.getClass().getName());
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
