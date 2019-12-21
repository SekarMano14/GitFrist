package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.google.common.base.Verify;

import junit.framework.Assert;

public class JUnit {
	
//	@AfterClass
//	public static void closebrowser() {
//		System.out.println("browser cloased");
//
//	}
//	@BeforeClass
//	public static void launchBrowser() {
//		System.out.println("Browser launched successfully");
//
//	}
//	@Before
//	public  void startTime() {
//		Date d=new Date();
//		System.out.println(d);
//
//	}
//	@After
//	public  void endTime() {
//		Date d=new Date();
//		System.out.println(d);}
	
	
	@Test
	public  void testCase1() {
		System.out.println("test1");

	}
	
	@Test
	public void testCase2() {
		System.out.println("test2");
		
	}
	@Test
	public void testCase3() {
		System.out.println("test3");
		
	}
	@Ignore
	@Test
	public void testCase4() {
		System.out.println("test4");
		
	}
	@Test
	public void testCase5() {
		String s="Selenium";
		Assert.assertTrue(s.equals("Selenium"));
		Assert.assertEquals(s, "selenium");

		System.out.println("test5");
	}
	@Ignore
	@Test
	public void testCase6() {
		System.out.println("test6");
	}
	public void testCase7() {
		System.out.println("test7");
	}

	

}
