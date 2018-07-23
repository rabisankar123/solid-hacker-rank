package com.hacker.earth;

import java.util.Scanner;

public class StackImplimetation {
	static int top=-1;
	public static void push(int[] stack,int value, int size) {
		
		if(top==size-1) {
			System.out.println("Stack is full.Overflow condition!");
		}else {
			top+=1;
			stack[top]=value;
		}
	}
	public static boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	public static void pop(int[] stack) {
		if(stack.length>-1) {
			top-=1;
			//System.out.println("pop()");
		}
		
		
	}
	
	public static void dispaly(int[] stack) {
		while(top>-1) {
			System.out.println(stack[top--]);
		}
		//System.out.println("Dispaly");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int value=sc.nextInt();
		int[] stack=new int[size];
		push(stack,value,size);
		push(stack,5,size);
		push(stack,7,size);
		pop(stack);
		dispaly(stack);
		
		dispaly(stack);
		
	}

}
