package com.basicclasses.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neelamadhaba\\git\\selenium-testscripts\\FrameWork\\Drivers\\chromedriver.exe");
		    driver= new ChromeDriver();
		    
		    
		}
		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\FirefoxDriver.exe");
		    driver= new FirefoxDriver();
			
		}	
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\InternetExplorerDriver.exe");
		    driver= new InternetExplorerDriver();
			
		}
		else {
			System.out.println("We don't support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
	} 
	
	public static void quitBrowser(WebDriver driver)
{
	driver.quit();	
	}
}
