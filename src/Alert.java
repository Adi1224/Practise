import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
//		handling alerts
		
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(3000);
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String textdisplayonalert = alert.getText();
		System.out.println(textdisplayonalert);
		alert.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
