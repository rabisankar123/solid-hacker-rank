package com.rob.string;
import java.util.Scanner;

public class EachWordRev {

		
		public static  String revStr(String str)
		{
			String res="";
			char[] ch=str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				int k=i;
				while(i<ch.length&& ch[i]!=' ') {
					i++;
				}
				int j=i-1;
				while(j>=k)
				{
					res=res+ch[j];
					j--;
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

		}

	}


