package rest.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComplexWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parent=driver.getWindowHandle();
		Set <String> win=driver.getWindowHandles();
		Iterator <String> it=win.iterator();
		//System.out.println(win.size());
		
		for(int i=0; i<win.size();i++)
		{
			String one =it.next();
			driver.switchTo().window(one);
			//System.out.println(driver.getTitle());
			if((driver.findElements(By.xpath("//img [contains(@alt, 'Cognizant')]")).size() != 0))
			{
				driver.findElementByXPath("//img [contains(@alt, 'Cognizant')]").click();
				break;
				
					}
			}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		

	}

}
