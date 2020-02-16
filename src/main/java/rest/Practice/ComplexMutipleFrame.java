package rest.Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComplexMutipleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.findElementByLinkText("Iframe with in an Iframe").click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement textbox =driver .findElementById("fgdf");
		textbox.click();*/
		
		/*for(int i=0;i<8;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println("frame 0");
				
				
			}
			if(i==3)
			{
				break;
			}
		}*/
		
		String str= "vivek";
		System.out.println(str.length());
		
		String c ="vivek is good";
		String[]d =c.split(" ");
		System.out.println(d.length);
		
		

	}

}
