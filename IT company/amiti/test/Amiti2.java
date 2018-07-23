package com.amiti.test;



public class Amiti2 {
	//private static String title = null;
	public enum Title{
		MR("Mr."),MRS("Mrs."),MS("Ms.");
		private final String title;
		private Title(String t) {
			title=t;
		}
		public  String format(String last, String frist) {
			return title+" "+frist+" "+last;
		}
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Title.MR.format("Deo", "John"));
	}

}
