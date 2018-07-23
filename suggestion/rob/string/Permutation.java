package com.rob.string;

public class Permutation {
	public static void stringPermutation(String input) {
		stringPermutation("",input);
	}
	public static void stringPermutation(String permutation,String input) {
		if(input.length()==0) {
			System.out.println(permutation);
		} else {
			for (int i = 0; i < input.length(); i++) {
				stringPermutation(permutation+input.charAt(i), 
						input.substring(0, i)+
						input.substring(i+1,input.length()));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringPermutation("jsp");
	}

}
