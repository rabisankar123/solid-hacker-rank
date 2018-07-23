package com.practice.tread.example;

public class ExcpTread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcpTread ex=new ExcpTread();
		Thread t1=new Thread(ex);
		t1.start();
	}
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("hii");
			int sum=10/0;
		}
	}

}
