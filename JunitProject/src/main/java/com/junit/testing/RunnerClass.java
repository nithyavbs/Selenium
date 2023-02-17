package com.junit.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//@RunWith(Suite.class)
//@SuiteClasses({A.class,B.class,SimpleJunit.class})
public class RunnerClass {

	@Test
	public void tc(){
		Result rc= JUnitCore.runClasses(A.class,SimpleJunit.class,B.class);
		System.out.println("Total test case run count:" + rc.getRunCount());
		System.out.println("Total test case run time:" + rc.getRunTime());
		System.out.println("Total test case ignore count:" + rc.getIgnoreCount());
		System.out.println("Total test case failure count:" + rc.getFailureCount());
		
		List<Failure> fails = rc.getFailures();
		for (Failure failure : fails) {
			System.out.println(failure);
		}
	}
}
