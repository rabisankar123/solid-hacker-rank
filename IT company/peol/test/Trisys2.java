package com.peol.test;

public class Trisys2 {
	public static void margeArray(int[] arr1, int[] arr2) {
		int[] arr3=new int[arr1.length+arr2.length];
		int j=0;
		for (int i = 0; i < arr1.length||i < arr2.length; i++) {
			arr3[j]=arr1[i];
			arr3[++j]=arr2[i];
			j++;
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2= {9,8,5};
		Trisys2.margeArray(arr1, arr2);
	}

}
