package com.list.jspider;

public class AddNo {
	public static void maxNo(int[][] arr) {
		
		for (int row = 0; row < arr.length; row++) {
			int max=0;
			for (int col = 0; col < arr.length; col++) {
				if(max<arr[row][col]) {
					max=arr[row][col];
					
				}
				
			}
			System.out.println(row+" th row max element is :"+max);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{5,2,3},{4,6,3},{3,10,12}};
		maxNo(arr);

	}

}
