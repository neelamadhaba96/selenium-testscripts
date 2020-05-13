package testpackageee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
//set the path of driver executive
	static {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
	}
	//Launch the browser
public static	WebDriver driver = new ChromeDriver();

}
