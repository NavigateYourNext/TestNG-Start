package com.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceExecution 
{
		// Execution of annotations are :-
	/*Before Suite
	Before Test
	Before Class
	Before Method
	Test Method
	After Method
	After Class
	After Test
	After Suite*/
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test()
	public void test()
	{
		System.out.println("Test Method");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("Test 2 Method");
		//int i = 9/0;
	}
	
	@Test()
	public void test3()
	{
		System.out.println("Test 3 Method");
	}
	
	@Test()
	public void test4()
	{
		System.out.println("Test 4 Method");
	}
	
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
