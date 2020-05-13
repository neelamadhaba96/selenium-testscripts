package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementDemo extends BaseClass {
	public static void main(String[] args) {
		
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		
		//get the address of viewLicence link
		WebElement viewLicLinkObj = driver.findElement(By.id("licenseLink"));
		//verify whether this view license is a link or not.
		String actTN = viewLicLinkObj.getTagName();
		System.out.println(actTN);//"a"
		if (actTN.equals(viewLicLinkObj)){
			System.out.println("View license is a link");
			viewLicLinkObj.click();
		}
		else {
			System.out.println("View license is not a link");
			driver.close();
		}
		
	}		

}
