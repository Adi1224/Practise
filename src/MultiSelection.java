import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
//		driver.findElement(By.id("drop1")).sendKeys("doc 3");// this is wrong way of selecting dropdown
		
			WebElement multiselectionboxfield = driver.findElement(By.id("multiselect1"));
		
		
		Select select= new Select(multiselectionboxfield);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Hyundai");
		
		Thread.sleep(3000);
		
		select.deselectByVisibleText("Volvo");
//		select.deselectByVisibleText("Audi");
		select.deselectByVisibleText("Hyundai");

	}

}
