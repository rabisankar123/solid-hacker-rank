package com.lumendata.test;

public class Inheritance {
	public static void main(String[] args) {
		Inheritance a;
		MySub b;
		a=new Inheritance();
		b=new MySub();
		a=b;
		b=(MySub) a;
		
	}

}
class MySub extends Inheritance{
	
}
