package testpackageee;

import org.openqa.selenium.JavascriptExecutor;

public class ClearFieldUsingJavaExecuterDemo extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('username').value= 'admin'");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('username').value= ''");
		Thread.sleep(3000);
		driver.close();
	}

}
