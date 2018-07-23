package com.hacker.solve;

import java.util.Scanner;

public class MaxPalindrome {
	//static MaxPalindrome s1;
	static String s;
	  static void initialize(String s) {
	        // This function is called once before all queries.
	       // s1=new MaxPalindrome();
	       s=s;
	    }

	    static int answerQuery(int l, int r) {
	        // Return the answer for this query modulo 1000000007.
	    	System.out.println(s);
	    	return 0;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        initialize(s);
	       /* int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            int l = in.nextInt();
	            int r = in.nextInt();
	            int result = answerQuery(l, r);
	            System.out.println(result);
	        }*/
	        in.close();
	    }
}
