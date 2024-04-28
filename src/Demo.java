

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
//		ChromeDriver is a predefined class of Selenium WebDriver library
//		we have created object for ChromeDriver class
//		WebDriver is an Interface
//		ChromeDriver represents Chrome Browser
//		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		
////		a blank chrome browser will be launched
//		WebDriver driver = new ChromeDriver();
//		
////		the provided url will be opened in above chrome browser
//		driver.get("https://omayo.blogspot.com/");
//		
////		maximizing the browser window
//		driver.manage().window().maximize();
//		
////		hold the execution for 5 seconds
////		Thread.sleep(5000); 
//		
//		
////		retrives the title of the page
////		String url1=driver.getCurrentUrl();
////		System.out.println(url1);
//		 
////		finding the UI element
//		WebElement ele =driver.findElement(By.linkText("Open a popup window"));
//		ele.click();
////		String url2=driver.getCurrentUrl();
////		System.out.println(url2);
////		driver.close();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.id("but1")).getAttribute("value");
//		System.out.println(ele1);
//		WebElement ele2=driver.findElement(By.linkText("Open a popup window"));
//		ele2.click();
		
//		driver.quit();
//		Thread.sleep(5000);
//		driver.findElement(By.id("input-email")).sendKeys("8928504072");
//		Thread.sleep(5000);
//		driver.findElement(By.id("input-password")).sendKeys("moryaloke");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click();
		
		Dimension d=driver.findElement(By.id("prompt")).getSize();
		
		System.out.println(d.height);
		System.out.println(d.width);
		
		
	}

}
