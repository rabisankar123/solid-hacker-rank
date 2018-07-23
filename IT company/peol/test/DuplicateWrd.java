package com.peol.test;

public class DuplicateWrd {
	public static void findDupWrd(String str) {
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		int size=0;
		
		String[] strarr=new String[count];
		for (int i = 0; i < str.length(); i++) {
			String res="";
			while(i<str.length()&&str.charAt(i)!=' ')
			{
				res+=str.charAt(i);
				i++;
			}
			strarr[size]=res;
			size++;
		}
		
		for (int i = 0; i < strarr.length; i++) {
			int countWrd=1;
			for (int j = i+1; j < strarr.length; j++) {
				if(strarr[i].equals(strarr[j])) {
					countWrd++;
				}
			}
			if(countWrd>1) {
				System.out.println(strarr[i]+" "+countWrd);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is java";
		findDupWrd(str);
	}

}
