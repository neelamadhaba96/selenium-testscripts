package testpackageee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class webelementGetCss extends BaseClass {
	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");	
		driver.findElement(By.xpath("//div[text()='Login '] ]")).click();
		String xp = "//span[contains(text(),'invalid')]";
		//Verify error msg is displayed
		
WebElement errmsgObj =driver.findElement(By.xpath(xp));
		boolean displayed = errmsgObj.isDisplayed();
		if (displayed)
		{
			System.out.println("Yes,error msg is displayed");
			//verify the error msg text is correct
		String actErrMsgText = errmsgObj.getText();
		
		if (actErrMsgText.equals("Username or Password is invalid" + "try again"))
		System.out.println("Valid error message displayed");
		
		//Verify the error message color is red or not
		String intialColorCode = errmsgObj.getCssValue("color");
		System.out.println("Intial color code -->"+intialColorCode);
		String colorAsHex = Color.fromString(intialColorCode).asHex();
		System.out.println("final color Code -->"+colorAsHex);
		
		}		
		
		
	}

}
