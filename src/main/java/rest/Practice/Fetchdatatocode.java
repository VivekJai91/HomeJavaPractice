package rest.Practice;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Fetchdatatocode  {
	
	
	
	@Test(dataProvider="register", dataProviderClass=ExcelFetch.class)
	public void formFill( String Url, String Un, String Pwd, String cPwd)
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 

	
		driver.get(Url);
	     driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Un);
		driver.findElement(By.xpath("//input[@id='usrPwd']")).sendKeys(Pwd);
		driver.findElement(By.xpath("//input[@id='cnfUsrPwd']")).sendKeys(cPwd);
	}

	

}
