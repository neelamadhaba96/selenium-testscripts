package testpackageee;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetAllLinks extends BaseClass {
public static void main(String[] args) {
	driver.get("https://www.facebook.com/");
	 List<WebElement> AllLinks = driver.findElements(By.xpath("a"));
	 //get the total no of link 
	 int TotalLinks = AllLinks.size();
	 System.out.println("Total no of link:" +TotalLinks);
	int LinkCount = 0;
}
}
