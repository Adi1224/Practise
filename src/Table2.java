import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String givenname="Praveen";
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		
		int row =0;
		for(int i=0;i<names.size();i++) 
		{
			
			if(names.get(i).getText().equalsIgnoreCase(givenname)) 
			{
				row=i;
				
			}
			
		}
		
		String xpath="//table[@id='table1']//tr["+(row+1)+"]/td[3]";
		System.out.println(driver.findElement(By.xpath(xpath)).getText());
		
	}

}
