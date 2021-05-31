package com.crm.utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.base.TestBase;

public class TestUtil extends TestBase
{

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT= 10;
	public Workbook wb;
	public Sheet sheet;
	public void switchWindowFrame(String frameName)
	{
		driver.switchTo().frame(frameName);
	}
	
	public void switchWindow()
	{
		for(String handles : driver.getWindowHandles())
		{
			System.out.println(handles);
			driver.switchTo().window(handles);
		}
	}
	
	public String getWindowTitle()
	{
		return driver.getTitle();
	}
	
	public Object[][] getData(String excelSheetPath,String sheetName)
	{
		FileInputStream file= null;
		Object[][] data = null;
		try {
			file = new FileInputStream(excelSheetPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(excelSheetPath.contains(".xlsx"))
		{
			try {
				wb=new XSSFWorkbook(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("xlsx");
		}else
		{
			try {
				wb=new HSSFWorkbook(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("xls");
		}
		
		sheet=wb.getSheet(sheetName);
		data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
				
		for(int i=0; i<sheet.getLastRowNum();i++)
		{
			for(int j=0; j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}		
		return data;
	}
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("UserDirectory");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
