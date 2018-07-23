package com.hacker.solve;

import java.time.LocalDate;
import java.util.Calendar;

public class Callender {
	public static String getDay(String day, String month, String year) {
		Calendar cal = Calendar.getInstance();
		int d=Integer.parseInt(day);
		int m=Integer.parseInt(day);
		int y=Integer.parseInt(day);
		LocalDate dt = LocalDate.of(y, m, d);
		System.out.print(dt.getDayOfWeek());
		cal.set(y, m, d);
		String res="";
		
		System.out.println(cal.get(cal.DAY_OF_WEEK));
		switch(cal.get(cal.DAY_OF_WEEK))
		{
		case 1:
			//System.out.println("SUNDAY");
			res= "SUNDAY";
			break;
			
		case 2:
			res=  "MONDAY";
			break;
			
		case 3:
			res= "TUESDAY";
			break; 
		case 4:
			res= "WEDNESSDAY";
			break; 
		case 5:
			res= "THURSDAY";
			break;
		case 6:
			res= "FRIDAY";
			break; 
		case 7:
			res= "SATURDAY";
			break;
			
			
		}
		
		
		return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDay("17","08","47"));
		
	}

}
