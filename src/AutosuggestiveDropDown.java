import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		WebElement input = driver.findElement(By.id("fromCity"));
		input.click();
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("del");
//		Actions a = new Actions(driver);
//		
//		
//		a.moveToElement(input).perform();
//		
		
		int i =0;
		
		while(i<4) {
			Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(Keys.DOWN);
		i++;
		}
		driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys(Keys.ENTER);
	}

}
