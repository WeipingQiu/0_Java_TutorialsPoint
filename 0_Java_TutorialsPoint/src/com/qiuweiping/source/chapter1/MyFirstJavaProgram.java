package com.qiuweiping.source.chapter1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyFirstJavaProgram {

	static int executorServicePoolSize = 2;
		
	public String retrieveMsg(String msgForTask1, String msgForTask2) {
		
		String result = "";
		// Split the job into 2 pieces
		DisplayMsgTask taskHello = new DisplayMsgTask(msgForTask1);
		DisplayMsgTask taskWorld = new DisplayMsgTask(msgForTask2);
		
		// Spawn 2 threads
		ExecutorService service =  Executors.newFixedThreadPool(executorServicePoolSize);
		
		Future<String> future1 = service.submit(taskHello);
		Future<String> future2 = service.submit(taskWorld);
		
		try {
			result = future1.get() + future2.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return result;
	}
}
