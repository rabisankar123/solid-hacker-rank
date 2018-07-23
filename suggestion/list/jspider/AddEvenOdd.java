package com.list.jspider;

public class AddEvenOdd {
	public static void add(int[] arr) {
		int esum = 0,osum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				esum+=arr[i];
			} else {
				osum+=arr[i];
			}
		}
		System.out.println(esum+"\n"+osum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,1,1,1,1};
		add(arr1);
	}

}
