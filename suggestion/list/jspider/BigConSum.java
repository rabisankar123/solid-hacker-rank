package com.list.jspider;

public class BigConSum {
	public static int sumOfNum(int[] arr) {
		int sum_max=0, sum_max_con=0;
		for (int i = 0; i < arr.length; i++) {
			sum_max+=arr[i];
			if(sum_max<0) {
				sum_max=0;
			}
			if(sum_max>sum_max_con) {
				sum_max_con=sum_max;
			}
		}
		return sum_max_con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,-3,-1,-2,10};
		System.out.println(sumOfNum(arr));
		
	}

}
