package com.hacker.solve;

import java.util.Scanner;

public class TwoCols {
	public static void printString(String[] str, int[] arr) {
		//String res="";
		for (int j = 0; j < 3; j++) {
			System.out.print(str[j]);
		
		
		for (int i1 = str[j].length(); i1 < 15; i1++) {
			System.out.print(" ");
		}
		if(arr[j]<=100) {
		System.out.print(0+""+arr[j]);
		System.out.println();
		}
		else {
			System.out.print(arr[j]);
			System.out.println();
		}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarr=new String[3];
		int[] arr=new int[3];
		  Scanner sc=new Scanner(System.in);
          System.out.println("================================");
          for(int i=0;i<3;i++){
              String s1=sc.next();
              int x=sc.nextInt();
              //Complete this line
             strarr[i]=s1;
             arr[i]=x;
          }
          printString(strarr,arr);
	}

}
