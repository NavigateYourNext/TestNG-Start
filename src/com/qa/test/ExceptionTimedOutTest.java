package com.qa.test;

import org.testng.annotations.Test;

public class ExceptionTimedOutTest 
{
	@Test(invocationTimeOut=2000) // to break infinite loop or to terminate test case after some time
	public void infiniteLoopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions=ArithmeticException.class) // to handle well known Exception
	public void handleException()
	{
		int i = 9/0;
		System.out.println(i);
	}
}
