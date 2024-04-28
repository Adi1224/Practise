import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Table1 {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// program to print the table headings and all the above other details
		
//		List<WebElement> tableheading = driver.findElements(By.xpath("//table[@id='table1']//th"));
//		int count = tableheading.size();
//		
//		
//		for(int i=0;i<count;i++) 
//		{
//			System.out.println(tableheading.get(i).getText());   
//		}
		
	System.out.println("----------------------------------------------------------------------------------------------------------");	
	
	// program to print the all table data 
		
//		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='table1']//td"));
//		int count1 = tabledata.size();
//		
//		
//		for(int i=0;i<count1;i++) 
//		{
//			System.out.println(tabledata.get(i).getText());   
//		}
		
	System.out.println("----------------------------------------------------------------------------------------------------------");	
	
	// program to print the table data of first row
		
		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td"));
		int count1 = tabledata.size();
				
				
		for(int i=0;i<count1;i++) 
		{
			System.out.println(tabledata.get(i).getText());   
		}
		
		
	}

}
