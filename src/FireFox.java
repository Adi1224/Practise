import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\AUTOMATION\\SeleniumProject\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		
	}

}
