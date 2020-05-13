//Using java executer


package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterDemo extends BaseClass{
	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		
		//Enter User name
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('username').value= 'admin'");
	//eNTER PASSWORD
	jse.executeScript("document.getElementsByName('pwd')[0].value = 'manager'");
	
	//Click on log in  button
	WebElement loginbt = driver.findElement(By.xpath("//div[text()='Login ']"));
	jse.executeScript("arguments[0].click()", loginbt);
	driver.close();
	
	}

}
