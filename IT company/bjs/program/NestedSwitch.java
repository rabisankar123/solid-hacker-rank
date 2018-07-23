package com.bjs.program;

import java.util.Scanner;

public class NestedSwitch {
public static void main(String[] args) {
	System.out.println("Enter what u want :");
	Scanner sc=new Scanner(System.in);
	String key=sc.nextLine();
	switch (key) {
	case "non-veg":
		System.out.println("Plzz.. Enter the type");
		
		String key1=sc.nextLine();
		switch (key1) {
		case "chicken":
			System.out.println("Eat Chicken");
			break;
		case "fish":
			System.out.println("Eat Fish");
			break;
		default: System.out.println("invalid");
			break;
		}
		
		break;
	case "veg":
		System.out.println("Eat veg");
		break;	
	default:
		System.out.println("invalid key");
		break;
	}
}
}
