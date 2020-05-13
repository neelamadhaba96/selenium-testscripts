package testpackageee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
	public static void main(String[] args) {
		
	//set the path of chrome.driver.exe file//
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//Launch chrome browser//
  WebDriver driver = new ChromeDriver();
  driver.get("http://www.google.com");
  String title = driver.getTitle();
  System.out.println(title);
  
  //Print the Url of the page//
String url = driver.getCurrentUrl();
 System.out.print(url);
  driver.close();

	
	}
}
