package com.qiuweiping.source.chapter1;

import java.util.concurrent.Callable;

class DisplayMsgTask implements Callable<String>{

	private String msg;
	DisplayMsgTask(String msg) {
		this.msg = msg;
	}
	
	private String getMsg() {
		return this.msg;
	}
	
	public String call() throws Exception {
		return this.getMsg();
	}

}
