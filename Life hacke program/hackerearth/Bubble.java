package com.hacker.earth;

import java.util.Scanner;

public class Bubble {
	 public static void main(String args[] ) throws Exception {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        int temp=0;
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n-1;j++){
	           if(arr[j]>arr[j+1]) {
	        	   temp=arr[j];
	        	   arr[j]=arr[j+1];
	        	   arr[j+1]=temp;
	           }
	        }
	        
	        }
	        if(temp==0) {
	        	System.out.println("0");
	        }else {
	        	System.out.println("1");
	        }
	        

	       

	    }

}
