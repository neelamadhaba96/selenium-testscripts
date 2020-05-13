package testpackageee;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReifmailAlertHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
     driver.findElement(By.xpath("//input[@value='Go']")).click();;
     Thread.sleep(30000);
  Alert alert =   driver.switchTo().alert();
  System.out.println(alert.getText());
//  Thread.sleep(30000);
 // alert.accept();
  Thread.sleep(30000);
  driver.close();
  
     

}
}
