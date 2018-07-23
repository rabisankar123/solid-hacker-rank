package com.amiti.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
class Demo extends Thread{
	@Override
	public void run() {
		
	}
}

public class AmitiThread extends Thread {
	static String str="";
	static String str1="", str2="";
	static int count1=0,count2=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("E:/desktop/book.txt");
		FileReader fr=null;
		try {
			fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			str=br.readLine();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		int len=str.length()/2;
		
		str1=str.substring(0, len);
		str2=str.substring(len, str.length());
		AmitiThread a=new AmitiThread();
		Thread t=new Thread(a);
		t.start();
		System.out.println(count1+" "+count2);
	
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < str1.length(); i++) {
			count1++;
		}
		for (int i = 0; i < str2.length(); i++) {
			count2++;
		}
	}
	

}
