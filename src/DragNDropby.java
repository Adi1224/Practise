import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropby {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement slider = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		
		Actions a = new Actions(driver);
		
		Thread.sleep(5000);
		
		
		a.dragAndDropBy(slider, 100, 0).perform();
		
		Thread.sleep(5000);
		
		a.dragAndDropBy(slider, -200, 0).perform();
		

	}

}
