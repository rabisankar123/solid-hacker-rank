package com.peol.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DupChar {

	public static void main(String[] args) {
		String input = new String("aaaaaaaaabbcccccc");
        char[] ch=input.toCharArray();
        Set<Character> setchar=new HashSet<Character>();
        for (int i = 0; i < ch.length; i++) {
			setchar.add(ch[i]);
		}
        StringBuilder str=new StringBuilder();
        for (Character character : setchar) {
			str.append(character);
		}
        	System.out.println(str);

	}

}
