package com.careerit.cj.json;

class One extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}




public class SingletonManager {

	public static void main(String[] args) throws InterruptedException {
			System.out.println("Start of main method");
			One t1 = new One();
			One t2 = new One();
			
			t1.setName("T1 ");
			t2.setName("T2 ");
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			System.out.println("End of main method");
	}
}
