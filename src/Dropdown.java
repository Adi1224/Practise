import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
//		driver.findElement(By.id("drop1")).sendKeys("doc 3");// this is wrong way of selecting dropdown
		
		WebElement drop1 =driver.findElement(By.id("drop1"));
		Select select=new Select(drop1);
		
//		we can use eithe one of the following
		select.selectByVisibleText("drop 3");
		select.selectByIndex(3);
		
	
		
		
		
		
	}

}
