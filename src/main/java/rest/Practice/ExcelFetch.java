package rest.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class ExcelFetch {
	
	static String data[][] =null;
	
	@DataProvider(name="register")
	public static String[][] registerData() throws IOException, Exception 
	{
	data=getExcelData();
		return data;
	}
	
	public static String[] [] getExcelData() throws IOException, Exception
	{
FileInputStream XL = new FileInputStream("C:\\Users\\LENOVO\\Desktop\\practice.xls");
		
	Workbook workbook = Workbook.getWorkbook(XL);
	Sheet sheet = workbook.getSheet("Sheet1");
	
	int rc = sheet.getRows();
	int col = sheet.getColumns();
	
	System.out.println(rc);
	System.out.println(col);
        
        String TestData [] [] = new String[rc-1][col];
        
        for( int i=1;i<rc;i++){
       	 for( int j=0;j<col;j++)
       	 {
       		 TestData [i-1][j]=sheet.getCell(j, i).getContents();
       	 }
        }
		return TestData;
	}
	


}




