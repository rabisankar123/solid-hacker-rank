package com.collection.parctice;

import java.util.Comparator;

public class Student implements Comparator{

	int id;
	String name;
	public Student(int id, String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Student st1=(Student) o1;
		int value=id-st1.id;
		System.out.println(value);
		return value;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return id+" "+name;
	}

}
