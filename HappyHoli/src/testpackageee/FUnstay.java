package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class FUnstay extends BaseClass{


	public static void main(String[] args) throws InterruptedException {
		driver.get("https://influenzstage.funstay.in/login");
		Thread.sleep(3000);
		 WebElement email = driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/div/div[1]/div[1]/div/input"));
		 email.sendKeys("neela321@co.in");
		 WebElement password = driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/div/div[2]/div[1]/div/input"));
		 password.sendKeys("neela@321");
		 driver.findElement(By.xpath("/html/body/app-root/app-login/form/div/div/div[3]/div[1]/button")).click();
		 Thread.sleep(3000);
		 driver.close();
	}

}
