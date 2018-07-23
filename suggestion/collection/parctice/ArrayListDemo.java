package com.collection.parctice;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("i lv java");
		al.add(10);
		Student st1=new Student(1, "");
		al.add(st1);
		al.add('a');
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.remove(2);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al.indexOf('a'));
	}

}
