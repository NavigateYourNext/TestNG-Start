package com.qa.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestClass 
{
	@Test
	@Parameters({"url","browser"})
	public void parameterPass(String url, String browser)
	{
		System.out.println("Url Is: "+url);
		System.out.println("Browser Is: "+browser);
	}
}
