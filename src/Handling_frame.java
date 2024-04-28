import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Handling_frame {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		WebElement iframe = driver.findElement(By.id("navbar-iframe"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.id("b-query")).sendKeys("Adinath mhetar");
		
		driver.switchTo().defaultContent();// to return back to default window
		driver.findElement(By.id("ta1")).sendKeys("Adinath sadanand mhetar");
		
		
		
		

	}

}
