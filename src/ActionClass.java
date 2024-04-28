import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		WebElement blogmenu = driver.findElement(By.id("blogsmenu"));
		
		a.moveToElement(blogmenu).perform();

		WebElement link = driver.findElement(By.xpath("//a/span[text()='Selenium143']"));
		
		Thread.sleep(5000);
		
		a.moveToElement(link).click(link).build().perform();
	
		
	
	}

}
