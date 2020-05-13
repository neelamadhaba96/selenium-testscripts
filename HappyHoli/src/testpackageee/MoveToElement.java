package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement extends BaseClass {
	public static void main(String[] args) {
		driver.get("http://istqb.in/");
	WebElement foundationobj =	driver.findElement(By.xpath("(//a[text()='FOUNDATION'])[1]"));
	Actions action = new Actions(driver);
	action.moveToElement(foundationobj).perform();
	}
}
