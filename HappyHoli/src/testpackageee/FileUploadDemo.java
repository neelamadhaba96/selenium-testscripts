package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadDemo extends BaseClass {
public static void main(String[] args) {
	driver.get("https://www.naukri.com/");
	WebElement uploadcvobj = driver.findElement(By.id("input_resumeParser"));
			uploadcvobj.sendKeys("C:\\Users\\Neelamadhaba\\Desktop\\Doc for Online Medical Booking.doc");
}
}
