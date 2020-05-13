package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AutoITDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		FirefoxProfile profile = new FirefoxProfile();
		//URL - http://kb.mozilazine.org//About:config_entries#Browser
		
		String key = "browser.helperApps.neverAsk.saveTODisk";
		//URL - https://www.freeformatter.com/mime-types-list.html
		String value = "application/zip";
		profile.setPreference(key, value);
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver1 =(WebDriver) new FirefoxOptions();
		driver1.get("https://www.seleniumhq.org/download/");
		
		driver1.get("https://www.seleniumhq.org/download/");
		//click on Download link of java 
		String xapthExpression = "//td1[textt()='Java']/following-sibling::td/a[text()='Download']";
		driver1.findElement(By.xpath(xapthExpression)).click();
		
	}

}
