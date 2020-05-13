package testpackageee;

import org.openqa.selenium.By;

public class FrameDemo extends BaseClass {
	public static void main(String[] args) {
		driver.get("file:///D:/myjava/Frame2.html");
		//Enter admin in to T1 textbox.
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("admin");
		//switch back to the main page - isng defaultcontent method.
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).sendKeys("Manager");
		
		
	}

}
