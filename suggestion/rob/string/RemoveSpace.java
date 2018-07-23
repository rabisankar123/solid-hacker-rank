package com.rob.string;

public class RemoveSpace {
	public static String findSpace(String str) {
		/*char[] ch=str.toCharArray();
		int len=ch.length;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' '&&ch[i+1]!=' ') {
				int j=i;
				len--;
				while(j<len) {
					ch[j]=ch[j+1];
					j++;
				}
			}
		}
		String res="";
		for (int i = 0; i < len; i++) {
			res+=ch[i];
		}*/
		String res=str.replace(" ", "");
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSpace("java is"));
	}

}
