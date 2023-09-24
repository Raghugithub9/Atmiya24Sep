package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementLocators {
	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
				
		//8 element locators
		//id,name,classname,,linktext,partiallinktext,tagname,xpath and cssSelector

		//Enter User - id=session_key 
		WebElement user=driver.findElement(By.id("session_key"));
		user.sendKeys("raghutest@gmail.com");
		
		//driver.findElement(By.id("session_key")).sendKeys("newtest");
		
		//WebElement user=driver.findElement(By.className("text-color-text font-sans text-md outline-0 bg-color-transparent grow"));
		
		

		//driver.findElement(By.id("session_key")).sendKeys("test@gmail.com");

		//WebElement u1=driver.findElement(By.id("session_key"));
		//u1.sendKeys("newtest@gmail.com");


				//Enter Password
		WebElement password=driver.findElement(By.name("session_password"));
		password.sendKeys("NewTest123");

				//Click on Join Now		
		//WebElement joinnow=driver.findElement(By.className("btn-md mb-1.5 mr-[6px] flex items-center w-max float-left btn-secondary"));
		//joinnow.click();

		//WebElement forgotpassword=driver.findElement(By.linkText("Forgot password?"));
		//WebElement forgotpassword=driver.findElement(By.partialLinkText("password?"));
		//forgotpassword.click();

		//WebElement useragreement=driver.findElement(By.partialLinkText("User"));
		//useragreement.click();
		//System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");

		WebElement privacy=driver.findElement(By.className("t-sans t-black--light t-semibold header-nav__toplink"));
		privacy.click();
			}

}
