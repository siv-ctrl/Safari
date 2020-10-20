package test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.WrapperClass;
import excel.Excel;
import pages.SearchCar;

public class SearchCarTest extends WrapperClass{
	@BeforeClass
	public void startUp() {
		launchBrowser();
		openWebsite();
	}
	
	@Test
	public void searchCarTest() throws Exception {
		SearchCar search= new SearchCar(driver);
		System.out.println(search.searchCar(Excel.getvalue1(), Excel.getvalue2()));
		Thread.sleep(1000);
		takeScreenshot("./Screenshots/image.jpg");
	}
	
	@AfterMethod
	public void close() {
		closeBrowser();
	}
}
