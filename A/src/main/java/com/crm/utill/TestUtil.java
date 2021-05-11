package com.crm.utill;

import com.crm.base.TestBase;

public class TestUtil extends TestBase
{

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT= 10;

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
}
