package com.rob.string;

public class DuplicateWrd {
	private static void findDuplicate(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		int len=ch.length;
		for (int i = 'a'; i <= 'z'; i++) {
			int count=0;
			for (int j = 0; j < len; j++) {
				char ch1=str.charAt(j);
				if(ch1==i)
				{
					
					count++;
					
				}
			}
			if(count!=0) {
				char ch2=(char)i;
			System.out.println(ch2+" is duplicate "+(count)+" times");
				
			}
			
		}
		for (int j = 0; j < len; j++) {
			System.out.print(ch[j]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicate("jaaaaaaaaaaaava is easy");
	}

}
