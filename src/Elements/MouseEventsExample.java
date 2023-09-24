package Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsExample {

	
	static WebDriver driver;
	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://amazon.in");
		
		//implicit wait - wait for specified time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		
		Actions act=new Actions(driver);
		
		WebElement we=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span"));
		
		act.moveToElement(we).build().perform();
		
		driver.findElement(By.linkText("Start here.")).click();

	}

}
