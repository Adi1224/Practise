import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(WebElement ele:elements) 
		{
			String s =ele.getText();
			if(s.length()>1) {
			System.out.println(s);
			}
		}

	}

}
