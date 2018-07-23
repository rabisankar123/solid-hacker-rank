package com.peol.test;

public class AdditionofNo {
	public static void addNumber(String str)
	{
		String s="";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int num=0;
			while(i<ch.length&&ch[i]!=' ') {
				if(ch[i]>=65&&ch[i]<=91||ch[i]>=97&&ch[i]<=121) {
					s=s+ch[i];
					
				} else if(ch[i]>=48&&ch[i]<=57) {
					num+=ch[i]-48;
				
				}
				
				i++;
				
				}
			s=s+num+" ";
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Th2is2 i2s st2ring2";
		addNumber(str);
	}

}
