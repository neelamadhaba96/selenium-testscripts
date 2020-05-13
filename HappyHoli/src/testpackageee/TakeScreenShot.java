package testpackageee;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class TakeScreenShot extends BaseClass{
	public static void main(String[] args) throws IOException {
		driver.get("https://www.amazon.com");  
		TakesScreenshot ts = (TakesScreenshot) driver;  
		File srcFile = ts.getScreenshotAs(OutputType.FILE);  
		File destFile = new File(".\\Screenshot\\ Amazon.png");  
		Files.copy(srcFile, destFile); 
		driver.close();
	}
}


