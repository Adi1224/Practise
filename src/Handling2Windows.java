import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Handling2Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ultimateqa.com/dummy-automation-websites/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SauceDemo.com")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		
		Iterator<String> itr = windowids.iterator();
		String mainwindow=itr.next();
		String childwindow=itr.next();
		
		driver.switchTo().window(childwindow);
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		driver.close();
		driver.switchTo().window(mainwindow);
		driver.close();
		
	}

}
