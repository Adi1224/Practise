import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		
		driver.findElement(By.cssSelector("[name='userid']")).sendKeys("adinath");
		
		a.sendKeys(Keys.TAB).perform();
		driver.findElement(By.cssSelector("[name='pswrd']")).sendKeys("1234");
		
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		

	}

}
