package com.rob.string;
//wap to reverse the whole string
import java.util.Scanner;

public class RevWholeStr {

	
	public static  String revStr(String str)
	{
		String res="";
		char[] ch=str.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			int k=i;
			while(i>=0&& ch[i]!=' ') {
				i--;
			}
			//System.out.println(i);
			int j=i+1;
			while(j<=k)
			{
				res=res+ch[j];
				j++;
			}
			res=res+' ';
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value :");
		String s=sc.nextLine();
		System.out.println(revStr(s));

	}// wap to count no of words in a given string

}
