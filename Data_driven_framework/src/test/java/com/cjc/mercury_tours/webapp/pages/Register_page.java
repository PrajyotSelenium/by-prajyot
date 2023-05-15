package com.cjc.mercury_tours.webapp.pages;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.mercury_tours.webapp.utility.Common;

// Register_page class

public class Register_page {

	  
	        public Register_page(WebDriver driver)
	        {
	        	Common.driver=driver;
	        }
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	        WebElement firstName;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")
	        WebElement lastName;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input")
	        WebElement phone;
	        
	        @FindBy(xpath = "//*[@id=\"userName\"]")
	        WebElement e;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")
	        WebElement address;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")
	        WebElement c;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input")
	        WebElement s;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input")
	        WebElement postalCode;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")
	        WebElement country;
	        
	        @FindBy(xpath = "//*[@id=\"email\"]")
	        WebElement userName;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")
	        WebElement password;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")
	        WebElement confirmPassword;
	        
	        @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")
	        WebElement btn;
	        
	        public void register() throws IOException, InterruptedException
	        {
	        	Common.ap=new FileAppender(Common.l,"src//test//resources//log4j_file//register.txt");
	        	Common.log.addAppender(Common.ap);
	        	
	        	String fn=Common.excel_fn();
	        	String ln=Common.excel_ln();
	        	String ph=Common.excel_ph();
	        	String email=Common.excel_email();
	        	String adr=Common.excel_adr();
	        	String city=Common.excel_city();
	        	String state=Common.excel_state();
	        	String pc=Common.excel_pc();
	        	String country=Common.excel_country();
	        	String un=Common.excel_un();
	        	String pw=Common.excel_pw();
	        	String cpw=Common.excel_cpw();
	        	
	        	firstName.sendKeys(fn);
	        	lastName.sendKeys(ln);
	        	phone.sendKeys(ph);
	        	e.sendKeys(email);
	        	
	        	Thread.sleep(3000);
	        	
	        	address.sendKeys(adr);
	        	c.sendKeys(city);
	        	s.sendKeys(state);
	        	postalCode.sendKeys(pc);
	        	
	        	Thread.sleep(3000);
	        	
	        	Select select=new Select(this.country);
	        	select.selectByVisibleText(country);
	        	
	        	Thread.sleep(3000);
	        	
	        	userName.sendKeys(un);
	        	password.sendKeys(pw);
	        	confirmPassword.sendKeys(cpw);
	        	
	        	Thread.sleep(3000);
	        	
	        	btn.click();
	        	
	        	Common.log.info("We have to registered successfully");
	        }
	        
}
