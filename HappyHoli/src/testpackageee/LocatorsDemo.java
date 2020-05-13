package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.seleniumhq.org/download/");
	 //click on the download link against java language
	 String xp="//td[text()='Java']/following-sibling::td/a[text()='Download']";
	 driver.findElement(By.xpath(xp)).click();
	} 

}
