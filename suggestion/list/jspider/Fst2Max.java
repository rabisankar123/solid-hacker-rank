package com.list.jspider;

public class Fst2Max {
	public static void find2Max(int[] arr, int pos) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(pos+"th element is = "+arr[arr.length-pos]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,11,7,9};
		
		find2Max(arr,4);
	}

}
