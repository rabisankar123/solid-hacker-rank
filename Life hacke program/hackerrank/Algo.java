package com.hacker.solve;

import java.util.Scanner;

public class Algo {
	 static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
	        // Complete this function
	        int alice=0;
	        int bob=0;
	        int[] arr=new int[2];
	        if(a0>b0){
	            alice++;
	            }
	        else if(b0>a0){
	            bob++;
	        }
	        if(a1>b1){
	            alice++;
	            }else if(a1<b1){
	            bob++;
	        }
	        arr[0]=alice;
	        arr[1]=bob;
	        
	       return arr;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        int[] result = solve(a0, a1, a2, b0, b1, b2);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");
	        

	    }

}
