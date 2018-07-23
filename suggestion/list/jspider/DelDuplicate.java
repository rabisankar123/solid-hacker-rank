package com.list.jspider;

public class DelDuplicate {
	public static void deleteDup(int[] arr)
	{
		int len=arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					len--;
					int k=j;
					while(k<arr.length-1)
					{
						arr[k]=arr[k++];
						
					}
					
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1,3,1};
		deleteDup(arr);
	}

}
