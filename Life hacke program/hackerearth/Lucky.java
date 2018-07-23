package com.hacker.earth;

import java.util.ArrayList;
import java.util.Scanner;
public class Lucky {
public static int countOdd(int[] arr) {
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2!=0) {
			count++;
		}
	}
	//System.out.println(count);
	
	return count;
}


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	int N=0;
	int[] arr;
	int i=0;
	ArrayList<String> al=new ArrayList<String>();
	while(i<T) {
		N=sc.nextInt();
		sc.nextLine();
		arr=new int[N];
		int j=0;
		while(j<N) {
			arr[j]=sc.nextInt();
			j++;
		}
		int c=countOdd(arr);
		if(c%2==0) {
			al.add("Unlucky");
		}else {
			al.add("Lucky");
		}
		i++;
	}
	for (String string : al) {
		System.out.println(string);
	}
	
	
}
}
