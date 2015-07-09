package com.qiuweiping.source.chapter1;

/*
 * This class aims to indicate the following:
 * 1. Introduce local / Instance and Class variables
 * 2. How to create Singleton class.
 */
public class MyFirstSingletonClass {

	
	// Keyword:
	// 	native
	// 	strictfp
	// 	transient
	// 	volatile
	
	/*
	 * Lazy instantiation -- create only when needed.
	 */
	private static MyFirstSingletonClass instance = null;
	protected MyFirstSingletonClass() {}
	
	public static MyFirstSingletonClass getInstance() {
		if(instance == null) {
			instance = new MyFirstSingletonClass();
		}
		return instance;
	}
	
}
