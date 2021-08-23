package com.careerit.cj.threads;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Table implements Runnable {

	@Override
	public void run() {
		int num = 19;

		System.out.println("Thread name :" + Thread.currentThread().getName());
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " is doing its job");
			for (int i = 1; i <= 10; i++) {
				System.out.println(String.format("%s * %s = %s", num, i, num * i));
			}
		}

	}

}

class CsvFormat implements Callable<String> {

	private List<String> list;

	public CsvFormat(List<String> list) {
		this.list = list;
	}

	@Override
	public String call() throws Exception {
		return String.join(",", list);
	}

}

public class ThreadUsingFunctionalStyle {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		Thread t1 = new Thread(() -> {
//			TaskManager obj = TaskManager.getInstance();
//			System.out.println(obj);
//		});
//
//		Thread t2 = new Thread(() -> {
//			TaskManager obj = TaskManager.getInstance();
//			System.out.println(obj);
//		});
//
//		Thread t3 = new Thread(() -> {
//			TaskManager obj = TaskManager.getInstance();
//			System.out.println(obj);
//		});
//		t1.start();
//		t2.start();
//		t3.start();
		Runnable r = () -> {
			TaskManager obj = TaskManager.getInstance();
			System.out.println(obj);
		};
		ExecutorService tp = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		tp.submit(r);
		tp.submit(r);
		tp.submit(r);
		
		Future<String> future = tp.submit(new  CsvFormat(List.of("A", "B", "C", "D", "E")));
		
		String result = future.get();
		System.out.println("Result is :"+result);
		tp.shutdown();
	}
}
