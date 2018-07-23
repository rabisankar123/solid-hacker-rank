package com.amiti.test;

public class Amiti1 {
	
	public static final String FOO="foo";
	public static void main(String[] args) {
		Amiti1 a=new Amiti1();
		Sub s=new Sub();
		System.out.print(Amiti1.FOO);
		System.out.print(Sub.FOO);
		System.out.print(a.FOO);
		System.out.print(s.FOO);
		System.out.print(((Amiti1)s).FOO);
		
		
	}

}
class Sub extends Amiti1{
	public static final String FOO="bar";
}
