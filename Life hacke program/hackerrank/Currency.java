package com.hacker.solve;
import java.text.*;
import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        
	      
	        NumberFormat formatter = new DecimalFormat("##.00");
	        String bal=formatter.format(payment);
	        // Write your code here.
	        String us="$"+bal;
	        String india="Rs."+bal;
	        String china="￥"+bal;
	        String france=bal+" €";
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	

}
