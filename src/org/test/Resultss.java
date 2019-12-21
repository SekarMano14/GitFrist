package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.test.tc.Sample2;

public class Resultss {
	public static void main(String[] args) {
		
		Result r = JUnitCore.runClasses(JUnit.class,Sample.class, Sample2.class);
		
		System.out.println("Total test count:"+ r.getRunCount());
		System.out.println("ignore count:"+ r.getIgnoreCount());
		System.out.println("Failure count:"+ r.getFailureCount());
		System.out.println("Run Time:"+ r.getRunTime());
		
		
		
		List<Failure> f = r.getFailures();
		
		for (Failure x : f) {
			System.out.println("Failed methos:"+x);
			
			
			boolean sr = r.wasSuccessful();
			System.out.println("test passed or Failed:"+ sr);
		}
	
			
		}
		
	}


