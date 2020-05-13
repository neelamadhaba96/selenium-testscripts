package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimedemo {
 public static void main(String[] args) {
	
			 WebDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			 WebElement unTB = driver.findElement(By.id("Username"));
			 Point p =unTB.getLocation();
			 int unxcor =p.getX();
			driver.findElement(By.id("Username")).getLocation().getY();
			int ht = driver.findElement(By.id("Username")).getSize().getHeight();
			System.out.println("Height of the textbox");
			driver.findElement(By.id("Username")).getSize().getWidth();
			System.out.println("Width of the username text box");
			driver.findElement(By.id("Keep me logged in")).click();
			String ActiTP = driver.findElement(By.id("Keep me logged in")).getAttribute("title");
			if (ActiTP.equals("Do not select if this computer is shared"))
	 System.out.println("Valid Toolpic");
			else
				System.out.println("Invalid tool pic");
			  
			    String v1 =("actiTIME 2019.1 Pro	");
			WebElement version = driver.findElement(By.xpath("//nobr[contains(text(),actiTIME)]"));
			String v2 = version.getText();
			if(v1.equals("v1"));
			System.out.println("the version is coreect");
			
		
}
}
