package com.qa.dataProviderTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.dataProviderUtility.DataProviderUtility;

public class HalfEbayTest
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2938&ru=");
	
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()throws Exception
	{
		ArrayList<Object[]> testData= DataProviderUtility.getDataFromExcel();
		return testData.iterator();
	}
	
	
	@Test(dataProvider="getTestData")  //No.Of.Coloumns in excel sheet should be matched with No.Of.Parameters in @Test Method
	public void ebayRegistrationTest(String fname,String lname,String address1, String address2, 
			String city, String state1,String zipcode,String email)
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);

		
		driver.findElement(By.xpath("//input[@name='address1']")).clear();
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address1);

		
		driver.findElement(By.xpath("//input[@name='address2']")).clear();
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(address2);

		
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);

		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select s = new Select(state);
		s.selectByVisibleText(state1);
		
		driver.findElement(By.xpath("//input[@name='zip']")).clear();
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(zipcode);
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='retype_email']")).clear();
		driver.findElement(By.xpath("//input[@name='retype_email']")).sendKeys(email);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
