package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {

	
	 WebDriver dr;
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.linkedin.com/");
		dr.manage().window().maximize();
		
	}

}
