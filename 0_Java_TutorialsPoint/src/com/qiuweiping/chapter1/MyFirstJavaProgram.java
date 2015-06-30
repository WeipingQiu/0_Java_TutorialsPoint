package com.qiuweiping.chapter1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyFirstJavaProgram {

	static String msgForTask1 = "Hello";
	static String msgForTask2 = " World";
	
	static int executorServicePoolSize = 2;
	
	
	public static void main(String[] args) {
		// Split the job into 2 pieces
		DisplayMsgTask taskHello = new DisplayMsgTask(msgForTask1);
		DisplayMsgTask taskWorld = new DisplayMsgTask(msgForTask2);
		
		// Spawn 2 threads
		ExecutorService service =  Executors.newFixedThreadPool(executorServicePoolSize);
		
		Future<String> future1 = service.submit(taskHello);
		Future<String> future2 = service.submit(taskWorld);
		
		try {
			System.out.println(future1.get() + future2.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}
