package com.hacker.solve;

import java.util.Scanner;

public class StromgPass {
	public static boolean capCheck(String pass) {
		boolean cap=false;
		char[] ch=pass.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65&&ch[i]<=90) {
				cap=true;
			}			
			}
		return cap;
	}
	public static boolean smallCheck(String pass) {
		boolean cap=false;
		char[] ch=pass.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97&&ch[i]<=121) {
				cap=true;
			}			
			}
		return cap;
	}
	public static boolean digitCheck(String pass) {
		boolean cap=false;
		char[] ch=pass.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=48&&ch[i]<=58) {
				cap=true;
			}			
			}
		return cap;
	}
	//!@#$%^&*()-+

	public static boolean spacialCheck(String pass) {
		boolean cap=false;
		char[] ch=pass.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='!'||ch[i]=='@'||ch[i]=='#'||ch[i]=='$'||ch[i]=='%'||ch[i]=='^'
					||ch[i]=='&'||ch[i]=='*'||ch[i]=='('||ch[i]==')'||ch[i]=='+'||ch[i]=='-') {
				cap=true;
			}			
			}
		return cap;
	}
	static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    //#Acc16
		
		if(password.length()>6)
		{
			int count=0;
			boolean cap=capCheck(password);
			boolean small=smallCheck(password);
			boolean sp=spacialCheck(password);
			boolean digit=digitCheck(password);
			if(!cap) {
				count++;
			}
			if(!small) {
				count++;
			}
			if(!sp) {
				count++;
			}
			if(!digit) {
				count++;
			}
			return count;
			
		}else {
			int len=password.length();
			return 6-len;
		}
		
		
		
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
