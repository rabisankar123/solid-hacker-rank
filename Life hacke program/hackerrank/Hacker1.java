package com.hacker.solve;

import java.util.ArrayList;
import java.util.Scanner;

public class Hacker1 {
	public static void find(ArrayList<ArrayList> list) {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<Integer> inner1=list.get(i);
			int v1=inner1.get(0);
			for (int j = i+1; j < list.size(); j++) {
				ArrayList<Integer> inner2=list.get(i);
				if(inner1.get(0)==inner2.get(0)) {
					
				}
			}
		}
	}

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        ArrayList<ArrayList> list=new ArrayList<>();
	        int n = in.nextInt();
	        int m = in.nextInt();
	        for(int a0 = 0; a0 < n; a0++){
	            int id_number = in.nextInt();
	            int amount = in.nextInt();
	            ArrayList<Integer> inner=new ArrayList<>();
	             
	            inner.add(id_number);
	            inner.add(amount);
	            list.add(inner);
	        }
	        in.close();
	    }
}
