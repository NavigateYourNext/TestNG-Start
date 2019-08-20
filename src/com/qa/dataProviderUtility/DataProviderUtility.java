package com.qa.dataProviderUtility;

import java.io.File;
import java.util.ArrayList;

import jxl.Sheet;
import jxl.Workbook;

public class DataProviderUtility
{
	public static ArrayList<Object[]> getDataFromExcel()throws Exception
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		Workbook wb = Workbook.getWorkbook(new File(System.getProperty("user.dir")+"\\HalfEbay_TestData.xls"));
		Sheet s = wb.getSheet("RegData");
		
		for(int row = 1; row<s.getRows(); row++)
		{
			String fname = s.getCell(0, row).getContents();
			String lname = s.getCell(1, row).getContents();
			String address1 = s.getCell(2, row).getContents();
			String address2 = s.getCell(3, row).getContents();
			String city = s.getCell(4, row).getContents();
			String state = s.getCell(5, row).getContents();
			String zipcode = s.getCell(6, row).getContents();
			String email = s.getCell(7, row).getContents();
		
			Object[] obj = {fname,lname,address1,address2,city,state,zipcode,email};
			
			myData.add(obj);
		}
		
		return myData;
		
	}
}
