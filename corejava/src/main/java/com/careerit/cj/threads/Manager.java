package com.careerit.cj.threads;

abstract class AbstractConfig{
	abstract void init(int num);
}

class Two extends AbstractConfig implements Runnable{

	private int num;
	public Two(int num) {
		init(num);
	}
	@Override
	void init(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		
			for(int i=1;i<=num;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
	}
	
	
}

public class Manager {

		public static void main(String[] args) {
			
			Two obj = new Two(10);
			Thread t1 = new Thread(obj,"T1 ");
			t1.start();
		}
}
