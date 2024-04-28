import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		int count=0;
		
		
//		to find no. of rows
		
		
		int rows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
	
		
		
//		to find no. of columnns in the table
		int columns = driver.findElements(By.xpath("//table[@id='table1']//tbody//td[1]")).size();
		
		System.out.println(rows+"   "+columns);
		
		
		
		
	}

}
