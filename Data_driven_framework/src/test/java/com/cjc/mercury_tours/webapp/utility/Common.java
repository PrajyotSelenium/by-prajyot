package com.cjc.mercury_tours.webapp.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;

// Common class

public class Common {

	       public static WebDriver driver;
	       public static Properties pro=new Properties();
	       public static HSSFWorkbook workbook;
	       public static HSSFSheet sheet;
	       public static HSSFRow row;
	       public static HSSFCell column;
	       public static FileInputStream file;
	       public static Logger log=Logger.getLogger(Common.class.getName());
	       public static Layout l=new PatternLayout();
	       public static Appender ap;
	       public static DataFormatter format=new DataFormatter();
	       
	       public static FileInputStream file() throws FileNotFoundException
	       {
	    	   file=new FileInputStream("src//test//resources//properties_file//mt.properties");   
	    	   return file;
	       }
	       
	       public static String excel_fn() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(0);
	    	   String fn=column.getStringCellValue();
	    	   return fn;
	       }
	       
	       public static String excel_ln() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(1);
	    	   String ln=column.getStringCellValue();
	    	   return ln;
	       }
	       
	       public static String excel_ph() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(2);
	    	   String ph=format.formatCellValue(column);
	    	   return ph;
	       }
	       
	       public static String excel_email() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(3);
	    	   String email=column.getStringCellValue();
	    	   return email;
	       }
	       
	       public static String excel_adr() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(4);
	    	   String adr=format.formatCellValue(column);
	    	   return adr;
	       }
	       
	       public static String excel_city() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(5);
	    	   String city=column.getStringCellValue();
	    	   return city;
	       }
	       
	       public static String excel_state() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(6);
	    	   String state=column.getStringCellValue();
	    	   return state;
	       }
	       
	       public static String excel_pc() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(7);
	    	   String pc=format.formatCellValue(column);
	    	   return pc;
	       }
	       
	       public static String excel_country() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(8);
	    	   String country=column.getStringCellValue();
	    	   return country;
	       }
	       
	       public static String excel_un() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(9);
	    	   String un=column.getStringCellValue();
	    	   return un;
	       }
	       
	       public static String excel_pw() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(10);
	    	   String pw=column.getStringCellValue();
	    	   return pw;
	       }
	       
	       public static String excel_cpw() throws IOException
	       {
	    	   file=new FileInputStream("src//test//resources//excel_file//mt.xls");
	    	   workbook=new HSSFWorkbook(file);
	    	   sheet=workbook.getSheet("Sheet1");
	    	   row=sheet.getRow(1);
	    	   column=row.getCell(11);
	    	   String cpw=column.getStringCellValue();
	    	   return cpw;
	       }
}
