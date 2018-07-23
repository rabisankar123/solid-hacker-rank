package com.apti.array;

public class DissimilerArray {
	public static void findDisEle(int[] arr1, int[] arr2) {
		int[] narr=new int[arr1.length+arr2.length];
		int k=0;
		for (int i = 0; i < arr1.length; i++) {
			int count=0;
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					count++;
				}
			}
			if(count==0) {
			narr[k++]=arr1[i];	
			}
			
		}
		for (int i = 0; i < arr2.length; i++) {
			int count=0;
			for (int j = 0; j < arr1.length; j++) {
				if(arr2[i]==arr1[j]) {
					count++;
				}
			}
			if(count==0) {
			narr[k++]=arr2[i];	
			}
			
		}
		for (int i = 0; i < narr.length; i++) {
			System.out.println(narr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,5};
		int[] arr2= {1,0,6,5};
		findDisEle(arr1,arr2);

	}

}
