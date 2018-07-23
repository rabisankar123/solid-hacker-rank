package com.hacker.solve;

import java.util.Scanner;

public class StringDemo {
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        char[] ch=s.toCharArray();
        for (int i = 0; i < k; i++) {
        	smallest+=ch[i];
			
		}
        for (int i = s.length()-k; i < s.length(); i++) {
        	largest+=ch[i];
			
		}
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}
