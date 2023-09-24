package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathCssExample {
public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriver dr=new ChromeDriver();
		
	System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
	WebDriver dr=new FirefoxDriver();
		
		dr.get("https://www.linkedin.com/");
		dr.manage().window().maximize();
		
		//WebElement user=dr.findElement(By.xpath("//html/body/main/section[1]/div/div/form/div[1]/div[1]/div/div/input"));
		
		WebElement user=dr.findElement(By.xpath("//input[@id='session_key']"));
		//WebElement user=dr.findElement(By.xpath("//input[@name='session_key']"));
		//WebElement user=dr.findElement(By.xpath("//a[@data-tracking-control-name='guest_homepage-basic_nav-header-join']"));
		//WebElement user=dr.findElement(By.xpath("//a[@href='https://www.linkedin.com/pulse/topics/careers-c1/']"));
		//user.sendKeys("new@test.com");
		
		//Absolute xpath - html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		//*[@id="email"] - Relative xpath
		//*[@
		
		//cssSelector
	
		
		
		WebElement password=dr.findElement(By.cssSelector("input#session_password"));
		//WebElement user=dr.findElement(By.cssSelector("input.input__input"));
		
		
		
		//tagname[atr='value']
		//tagname.atrivalue
		//#u_0_5_bj
		//#email
		//*[@id="session_password"]
		
		
		//CssSelector
		//#session_password
		//css=tag#id
		//css=tag.class
		//css=tag[attribute=value]
		//css=tag.class[attribute=value]
		
		user.sendKeys("new@test.com");
		password.sendKeys("newtest123");

		
		
		
		
	}

}
