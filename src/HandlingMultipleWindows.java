import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingMultipleWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ultimateqa.com/dummy-automation-websites/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SauceDemo.com")).click();//saucedemo link will be open
		driver.findElement(By.linkText("ultimateqa.com/automation")).click();//ultimate qa link will be open
		
		Set<String> windowids = driver.getWindowHandles();
		
		
		Iterator<String> itr = windowids.iterator();
		
		while(itr.hasNext()) 
		{
			String windowid = itr.next();
			driver.switchTo().window(windowid);
			
			if(driver.getTitle().equals("Swag Labs")) 
			{
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
				driver.findElement(By.name("login-button")).click();
			
			}
			
			
			
			
			
		}
		
		
	}

}
