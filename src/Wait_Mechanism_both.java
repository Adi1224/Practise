import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Wait_Mechanism_both {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
//		selenium implicit wait - global wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		0 seconds- imediately click
		driver.findElement(By.className("dropbtn")).click();
		
//		3 seconds - 3 seconds only it will wait
		driver.findElement(By.linkText("Facebook")).click();
		
//		30 seconds of wait time- explicit wait
		WebDriverWait wait= new WebDriverWait(driver, 30);
		WebElement facebook = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
		
		facebook.click();
		
		driver.quit();
	}

}
