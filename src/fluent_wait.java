import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluent_wait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	
//	selenium implicit wait - global wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
//	0 seconds- imediately click
		driver.findElement(By.className("dropbtn")).click();
		
		
/*
 		waiting 30 seconds for an element to be present on the page, checking for its presence once every 5 seconds
 
 
 
 */
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofMillis(5))
		            .ignoring(ElementNotInteractableException.class);

		wait.until(new Function<WebDriver,WebElement>() 
		{ public WebElement apply(WebDriver driver) {
			return driver.findElement(By.id("foo"));
		}
		});
		
		
		driver.quit();
		
	}

}
