package com.practice.tread.example;



class ThreadOne extends Thread{
	String str1;
	String str2;
	public ThreadOne(String str1, String str2) {
		
		this.str1 = str1;
		this.str2 = str2;
	}
	public void run() {
		synchronized (str1) {
			System.out.println("thread1 hold the obj lock"+str2);
			synchronized (str2) {
			System.out.println("thread1 is wating for obj lock"+str1);	
			}
		}

	}
	
}
class ThreadTwo extends Thread{
	String str1;
	String str2;
	public ThreadTwo(String str1, String str2) {
		
		this.str1 = str1;
		this.str2 = str2;
	}
	public void run() {
		synchronized (str1) {
			System.out.println("thread2 hold the obj lock"+str2);
			synchronized (str2) {
			System.out.println("thread2 is wating for obj lock"+str1);	
			}
		}

	}
	
}

public class DeakLock {
	public static void main(String[] args) {
		String str1=new String("java");
		String str2=new String("java1");
		ThreadOne t1=new ThreadOne(str1,str2);
		t1.start();
		try {
			t1.sleep(50000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadTwo t2=new ThreadTwo(str1,str2);
		 t2.start();
		 try {
				t2.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
