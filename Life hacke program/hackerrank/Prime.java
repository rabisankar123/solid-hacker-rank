package com.hacker.solve;
import java.util.ArrayList;

public class Prime {

	public static void checkPrime(ArrayList al) {
		for (Object obj : al) {
			if((Integer)obj>1) {
				for (int i = (Integer)obj; i >1 ; i--) {
					if(i==2) {
						System.out.print(i);
					}
					if(i%2!=0) {
						System.out.print(i);
					}
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(5);
		checkPrime(al);
		
	}

}
