package testpackageee;

import org.openqa.selenium.By;

public class AlertDemo extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	driver.findElement(By.xpath("//input[@value = 'Confirmation Alert']")).click();
	Thread.sleep(1000);
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	
	//Click  on OK button on alert popup.
	alert.dismiss();
	Thread.sleep(1000);
	driver.close();
}
}
