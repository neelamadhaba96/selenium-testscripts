package testpackageee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DobleClickAndClear extends BaseClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernameObj =driver.findElement(By.id("username"));
	usernameObj.sendKeys("admin");
	Thread.sleep(3000);
	//Actions action = new Actions(driver);
	//action.doubleClick(usernameObj).perform();
	//Using robot key clear the username text box
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DELETE);
	//r.keyPress(KeyEvent.VK_BACK_SPACE);
	Thread.sleep(3000);
	
}
}
