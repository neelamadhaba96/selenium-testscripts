package testpackageee;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickdemo extends BaseClass{
	public static void main(String[] args) throws InterruptedException, AWTException {
		driver.get("https://demo.actitime.com/login.do");
	WebElement Actitimeinc =	driver.findElement(By.xpath("//a[//a[text() ='actiTIME Inc.']]"));
	Actions action = new Actions(driver);
	action.contextClick(Actitimeinc).perform();
	Thread.sleep(1000);
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_G);
	r.keyRelease(KeyEvent.VK_G);
	Thread.sleep(2000);
	driver.close();
	}

}
