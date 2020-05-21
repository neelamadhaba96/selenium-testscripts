package com.testing.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.basicclasses.test.BrowserFactory;

public class LoginPageTripshifu {
	WebDriver driver;
	@Test
	public void loginapp() {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://ecomdashboard.funstay.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}


}
