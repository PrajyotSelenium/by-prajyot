package com.cjc.mercury_tours.webapp.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.FileAppender;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cjc.mercury_tours.webapp.pages.Login_page;
import com.cjc.mercury_tours.webapp.pages.Register_page;
import com.cjc.mercury_tours.webapp.utility.Common;

public class MTTest {

	    @BeforeSuite
	    public void openBrowser() throws IOException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	FileInputStream fis=Common.file();
	    	Common.pro.load(fis);
	    	
	    	System.setProperty(Common.pro.getProperty("property"), Common.pro.getProperty("file"));
	    	Common.driver=new ChromeDriver();
	    	
	    	Common.log.info("Browser opened successfully");
	    }
	    
	    @BeforeTest
	    public void openUrl() throws IOException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	FileInputStream fis=Common.file();
	    	Common.pro.load(fis);
	    	
	    	Common.driver.get(Common.pro.getProperty("website"));
	    	
	    	Common.log.info("Url opened successfully");
	    }
	    
	    @BeforeClass
	    public void max() throws IOException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	Common.driver.manage().window().maximize();
	    	
	    	Common.log.info("Screen maximized successfully");
	    	
	    }
	    
	    @BeforeMethod
	    public void timeoutAndCookies() throws IOException, InterruptedException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	Thread.sleep(3000);
	    	
	    	Common.log.info("Timeout successfully");
	    	
	    	Set<Cookie> cookies=Common.driver.manage().getCookies();
	    	for(Cookie cookie:cookies)
	    	{
	    		Common.log.info("Details of cookies");
	    		Common.log.info("Name of cookies = "+cookie.getName());
	    		Common.log.info("Domain of cookies = "+cookie.getDomain());
	    		Common.log.info("Class name of cookies = "+cookie.getClass());
	    		Common.log.info("Value of cookies = "+cookie.getValue());
	    		Common.log.info("Path of cookies = "+cookie.getPath());
	    		Common.log.info("Expiry date and time information of cookies = "+cookie.getExpiry());
	    		Common.log.info("Is http only? = "+cookie.isHttpOnly());
	    		Common.log.info("Is cookies secure? = "+cookie.isSecure());
	    		Common.log.info("==================================================================================");
	    	}
	    }
	    
	    @Test(priority = 1)
	    public void test() throws IOException, InterruptedException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	Register_page rp=PageFactory.initElements(Common.driver, Register_page.class);
	    	rp.register();
	    	
	    	Common.log.info("Register method called successfully");
	    	
	    	Thread.sleep(3000);
	    }
	    
	    @DataProvider
	    public Object[][] getData()
	    {
	      return new Object[][]
	    		  {
	    	  new Object[] {"Prajyot Gujarkar","Prajyot_123"}
	    		  };
	    }
	    
	    @Test(priority = 2,dataProvider="getData")
	    public void test0(String un,String pw) throws IOException, InterruptedException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	Login_page lp=PageFactory.initElements(Common.driver, Login_page.class);
	    	lp.logIn(un, pw);
	    	
	    	Common.log.info("Login method called successfully");
	    	
	    	Thread.sleep(3000);
	    }
	    
	    @AfterMethod
	    public void screenshot() throws IOException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	File src=((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFileToDirectory(src, new File("src//test//resources//screenshots"));
	    	
	    	Common.log.info("We have to taken screenshots successfully");
	    }
	    
	    @AfterClass
	    public void deleteCookies() throws IOException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	Common.driver.manage().deleteAllCookies();
	    	
	    	Common.log.info("After deleted all cookies");
	    	
	    	Set<Cookie> cookies=Common.driver.manage().getCookies();
	    	for(Cookie cookie:cookies)
	    	{
	    		Common.log.info("Details of cookies");
	    		Common.log.info("Name of cookies = "+cookie.getName());
	    		Common.log.info("Name of cookies = "+cookie.getDomain());
	    		Common.log.info("Name of cookies = "+cookie.getClass());
	    		Common.log.info("Name of cookies = "+cookie.getValue());
	    		Common.log.info("Name of cookies = "+cookie.getPath());
	    		Common.log.info("Name of cookies = "+cookie.getExpiry());
	    		Common.log.info("Name of cookies = "+cookie.isHttpOnly());
	    		Common.log.info("Name of cookies = "+cookie.isSecure());
	    		Common.log.info("==================================================================================");
	    	}
	    }
	    
	    @AfterTest
	    public void dbClose() throws IOException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	Common.log.info("Database connections are closed successfully");
	    }
	    
	    @AfterSuite
	    public void browserClose() throws IOException
	    {
	    	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//test.txt");
	    	Common.log.addAppender(Common.ap);
	    	
	    	Common.driver.close();
	    	
	    	Common.log.info("Browser closed successfully");
	    }
}
