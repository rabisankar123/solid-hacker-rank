package com.praveen.program;

public class Pattern {
	private static final String STAR="* ";
	private static final String SPACE="  ";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[][] data= {
				{1,1,0,0,0,1,1},
				{1,0,1,0,1,0,1},
				{1,0,0,1,0,0,1},
				{0,1,0,0,0,1,0},
				{0,0,1,0,1,0,0},
				{0,0,0,1,0,0,0},
				
		};*/
		int[][] data= {
				
				{1,1,1,1},
				{1,0,0,1},
				{1,0,0,1},
				{1,1,1,1},
				
		};
		starprint(data);
		}
	public static void printArray(String s) {
		
			
			System.out.print(s);
		
		
		
	}
	public static void starprint(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]==1) {
					
					printArray(STAR);
				} else {
					printArray(SPACE);
				}
			}
			System.out.println();
		}
	}
	}


