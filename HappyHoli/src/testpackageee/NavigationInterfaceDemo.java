package testpackageee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationInterfaceDemo {
	public static void main(String[] args) {
		
		//set the path of chrome.driver.exe file//
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//Launch chrome browser//
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com");//google//
	  driver.navigate().to("http://www.facebook.com");//facebook
	  //Come back to google page
	  driver.navigate().back();
	  //Go to next page
	  driver.navigate().forward();
	  //refresh the page
	  driver.navigate().refresh();
	  driver.close();
	
	}
}
