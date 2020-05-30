package rest.Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataExcelExecuteclass {
	
	@Test
	public static void execute() throws IOException, InterruptedException{
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
		int rowCount = DataExcelUtil.getRowCount("Sheet1");
		System.out.println(rowCount);
		for (int rowNum=2; rowNum<=rowCount;rowNum++)
		{
		
		
		String Username = DataExcelUtil.getStringCellData("Sheet1", "Username",rowNum);
		System.out.println(Username);
		String Password = DataExcelUtil.getStringCellData("Sheet1", "Password",rowNum);
		System.out.println(Password);
		String CPassword = DataExcelUtil.getStringCellData("Sheet1", "Confirm Password",rowNum);
		System.out.println(CPassword);
		
		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='usrPwd']")).clear();
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).clear();
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys(CPassword);
		}
		
	}
	
	 

}
