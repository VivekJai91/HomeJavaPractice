package rest.Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingSendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
		WebElement ele =driver.findElementByXPath("//input[@name='q']");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Method 1
		jse.executeScript("document.getElementsByName('q')[0].value='testing'");
		//Method 2
		jse.executeScript("arguments[0].value='testing'",ele);

	}

}
