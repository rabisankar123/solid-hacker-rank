package com.hacker.solve;

import java.util.ArrayList;
import java.util.Scanner;

public class Lego {
	static int productOfLegoTypes(int a, int b, int c, int d, int p, int q) {
        // Return the product of r and s
        ArrayList<Integer> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        try {
        list.remove(new Integer(p));
        list.remove(new Integer(q));
        }catch(Exception e) {
        	e.printStackTrace();
        }
        int count=1;
        for (int i = 0; i < list.size(); i++) {
			
		
			count*=list.get(i);
		}
        
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            int answer = productOfLegoTypes(a, b, c, d, p, q);
            System.out.println(answer);
        }
        in.close();
    }

}
