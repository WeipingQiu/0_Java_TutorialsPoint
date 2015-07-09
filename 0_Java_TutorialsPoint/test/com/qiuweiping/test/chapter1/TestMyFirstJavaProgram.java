/**
 * 
 */
package com.qiuweiping.test.chapter1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qiuweiping.source.chapter1.MyFirstJavaProgram;

/**
 * @author Weiping Qiu
 *
 */

public class TestMyFirstJavaProgram {

	private String msg1 = "Hello";
	private String msg2 = " World";
	
	private MyFirstJavaProgram myFirstJavaProgram = null;
	
	private static void trace(String value) {
		// If necessary, validate the value.
		System.out.println(value);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		myFirstJavaProgram = new MyFirstJavaProgram();
		
	}

	@After
	public void tearDown() throws Exception {
		myFirstJavaProgram = null;
	}

	@Test
	public void test() {
		String actual = myFirstJavaProgram.retrieveMsg(msg1, msg2);
		trace(actual);
		Assert.assertEquals("The result is not matched.",msg1+msg2, actual);
	}
	
}
