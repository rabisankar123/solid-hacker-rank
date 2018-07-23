package com.hacker.solve;

public class ExecptionDemo {
	public static int findExcep(int a, int b) {
		if(a==0||b==0) {
			try {
				throw new Exception("n and p should not be zero.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(a<0||b<0) {
			try {
				throw new Exception("n and p should not be negative.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int res=1;
		if(a>0||b>0) {
			
			for (int i = 0; i < b; i++) {
				res*=a;
			}
			//System.out.println(res);
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		System.out.println();
	}

}
