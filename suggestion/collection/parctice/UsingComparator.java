package com.collection.parctice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(5, "shiva");
		Student s2=new Student(61, "deba");
		Student s3=new Student(15, "kaka");
		Student s4=new Student(51, "mana");
		TreeMap al= new TreeMap();
		al.put(s1,s2);
		al.put(s3,s4);
		
		Set st1=al.keySet();
	
		
	}

}
