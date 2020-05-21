package com.testing.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.basicclasses.test.BaseClass;

public class LoginPageTripshifu {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		// TODO Auto-generated method stub
		driver= BaseClass.startApplication(driver,  "Chrome", "https://ecomdashboard.funstay.in/");
		System.out.println(driver.getTitle());
	}

}
