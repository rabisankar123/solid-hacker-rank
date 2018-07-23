package com.hacker.solve;

public class Arithmetic {
	public int add(int x, int y) {
		return x+y;
	}
}
class Adder extends Arithmetic
{
	public Adder(int a, int b) {
		add(a,b);
	}
}
