package com.qa.test;

import org.testng.annotations.Test;

public class InvocationCountTest
{
	@Test(invocationCount=10) //to execute same test n times
	public void sum()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("Sum Is : "+c);
	}
}
