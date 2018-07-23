package com.hacker.solve;

import java.util.Scanner;

public class Number {
public static void main(String[] args) {
	    
	    
		Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();
        int[] arr=new int[(R-L)+1];
        // Write here the logic to print all integers between L and R
        
        for(int i=0;i<(R-L)+1;i++){
            arr[i]=L+i;
        }
        for(int i=0;i<(R-L)+1;i++){
           System.out.print(arr[i]);
        }
        
        

		s.close();
	}

}
