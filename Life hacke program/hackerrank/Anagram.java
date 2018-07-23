package com.hacker.solve;

public class Anagram {
	 static boolean isAnagram(String a, String b) {
		 int c1,c2;
		 if(a.length()!=b.length()) {
			 return false;
		 }
		a=a.toLowerCase();
		b=b.toLowerCase();
		System.out.println(a);
		System.out.println(b);
		 for (int i = 'a'; i < 'z'; i++) {
			c1=0;
			c2=0;
			for (int j = 0; j < a.length(); j++) {
				if(i==a.charAt(j)) {
					c1++;
				} 
				if(i==b.charAt(j)) {
					c2++;
				}
			}
			
			if(c1!=c2) {
				return false;
			}
			
		}
		 
		 
		 
	       return true;
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("Madam","madam"));
	}

}
