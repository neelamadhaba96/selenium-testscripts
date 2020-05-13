package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TotalNoFrames extends BaseClass {
	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		WebElement size = driver.findElement(By.tagName("iframe"));
		System.out.println(size);
		int framecount =0;
		
	}

}
