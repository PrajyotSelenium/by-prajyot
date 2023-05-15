package com.cjc.mercury_tours.webapp.pages;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.mercury_tours.webapp.utility.Common;

// Login_page class

public class Login_page {

	         public Login_page(WebDriver driver)
	         {
	        	 Common.driver=driver;
	         }
	         
	         @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")
	         WebElement btn;
	         
	         @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
	         WebElement un;
	         
	         @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	         WebElement pw;
	         
	         @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")
	         WebElement btn0;
	         
	         public void logIn(String userName,String password) throws InterruptedException, IOException
	         {
	        	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//login.txt");
	 	    	Common.log.addAppender(Common.ap);
	 	    	
	        	btn.click();
	        	
	        	Thread.sleep(3000);
	        	
	        	un.sendKeys(userName);
	        	pw.sendKeys(password);
	        	
	        	Thread.sleep(3000);
	        	
	        	btn0.click();
	        	
	        	Common.log.info("We have to logged in successfully");
	         }
}
