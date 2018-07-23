package com.bjs.program;

public class Palindrome {
 public static boolean findPalindrom(int num) {
	 int sum = 0,temp=num;
	 while(num>0) {
		
		sum=(sum*10)+num%10;
		num=num/10;
	 }
	 
	 if(sum==temp) {
		 return true;
	 }
	 return false;
 }
 public static void main(String[] args) {
	boolean b=Palindrome.findPalindrom(121);
	if(b) {
		System.out.println("palindrom");
	}else {
		System.out.println("not palindrom");
	}
}
}
