import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multipledrivers {

	public static void main(String[] args) 
	{
		WebDriver driver=null;
		
		String browser="firefox";
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\msedgedriver.exe");
			 driver=new EdgeDriver();
		}
		
		driver.get("https://omayo.blogspot.com/");
		 
		List<WebElement> ele = driver.findElements(By.tagName("a"));
				
			for(WebElement tag:ele) 
				{
					if(tag.getText().length()>1) 
					{
						System.out.println(tag.getText());
					}
				}
				
				driver.quit();
				
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.setProperty("webdriver.edge.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\msedgedriver.exe");
//		 driver=new EdgeDriver();
//		
//		driver.get("https://omayo.blogspot.com/");
//
//		
//		 List<WebElement> ele = driver.findElements(By.tagName("a"));
//		
//		for(WebElement tag:ele) {
//			if(tag.getText().length()>1) 
//			{
//				System.out.println(tag.getText());
//			}
//		}
//		
//		driver.quit();
//		



