package rest.Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPickDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("//*[@id='search']/div/div[3]/div/label").click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		List <WebElement> date= driver.findElementsByXPath("//div[@id='rb-calendar_onward_cal']/table//td");
		
		for(int i=0;i<date.size();i++)
		{
			String day =date.get(i).getText();
			if(day.equalsIgnoreCase("29"))
			{
				date.get(i).click();
				break;
				
			
			}
			
		}
		

	}

}
