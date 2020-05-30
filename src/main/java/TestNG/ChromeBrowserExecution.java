package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

 
 
public class ChromeBrowserExecution extends CrossbrowserInvoke{
	
	
	
	
	@Test(priority= 1)
	public void testPageChrome()
	
	{
		
		driver.get("https://www.google.com/");
	}
	
	@Test (priority= 2)
	public void testSearchbox()
	{
		driver.findElement(By.name("q")).sendKeys("vivek");
	}

}
