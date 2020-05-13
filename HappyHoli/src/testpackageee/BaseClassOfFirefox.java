package testpackageee;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassOfFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "\"C:\\Users\\Neelamadhaba\\eclipse-workspace\\HappyHoli\\drivers\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		
	}

}
