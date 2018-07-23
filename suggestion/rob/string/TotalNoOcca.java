package com.rob.string;

public class TotalNoOcca {
	public static int findOccurrence(String str, char c) {
		int count=0;
		for (int j = 0; j <str.length(); j++) {
			if(str.charAt(j)==c) {
				count++;
			}
		}
		return count;
		
		
		
		
		/*int count= str.length()-str.replace(c, "").length();
		return count;*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findOccurrence("java is j2ee",'a'));

	}

}
