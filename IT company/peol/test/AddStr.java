package com.peol.test;

import java.util.Scanner;

public class AddStr {
	public static void addString(String s, int pos, String gstr)
	{
		char[] ch=s.toCharArray();
		int count=1;
		int j=0;
		String str="";
		for (int i = 0; i < ch.length; i++) {
			
			
			while(i<ch.length)
			{
				if(ch[i]==' '&&ch[i+1]!=' ')
				{
					count++;
				}
				else if(count==pos&&j==0)
				{
					str+=gstr+" ";
					j++;
				}
				str+=ch[i];
				i++;
			}
			if(count<pos&&j==0)
			{
				str+=" "+gstr;
				j++;
			}
			
			
			//System.out.println("i= "+i+"j= "+j);
		}
		
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		System.out.println("Enter Position :");
		int pos=sc.nextInt();
		System.out.println("Enter String for add :");
		String str1=sc.next();
		addString(str,pos,str1);
	}

}
