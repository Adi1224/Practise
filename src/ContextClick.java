import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement search = driver.findElement(By.name("q"));
			
			search.sendKeys("adinath mhetar");
			
			Actions a = new Actions(driver);
//			a.contextClick(search).perform();
			
			Thread.sleep(5000);
			a.doubleClick(search).perform();
			
		

	}

}
