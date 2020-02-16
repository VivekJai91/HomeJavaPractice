package rest.Practice;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String link = null;

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.divers-supply.com");
		List<WebElement> links = driver.findElementsByTagName("a");
		
		System.out.println(links.size());
		
		for (int i =0; i<links.size();i++)
		{
			link =links.get(i).getAttribute("href");
		}
		System.out.println(link);
		
	}
	

}
