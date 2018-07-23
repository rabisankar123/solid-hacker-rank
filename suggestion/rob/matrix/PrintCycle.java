package com.rob.matrix;

public class PrintCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int[5][5];
		int count=0;
		
		for(int start = 0, end = arr.length - 1; start <= end; start++, end--)
		{
			for (int i = start; i < end; i++) {
				arr[start][i]=count++;
				
			}
			for (int i = start; i < end; i++) {
				arr[i][end]=count++;
				
			}
			for (int i = end; i >start; i--) {
				arr[end][i]=count++;
				
			}
			for (int i = end; i >start; i--) {
				arr[i][start]=count++;
				
			}
			if(arr.length%2!=0)
			{
				arr[arr.length/2][arr.length/2]=count++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}

	}

}
