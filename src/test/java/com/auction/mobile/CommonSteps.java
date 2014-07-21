package com.auction.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.TestNG;

public class CommonSteps {

	WebDriver driver =null;
	
	public CommonSteps(WebDriver driver) {
		this.driver=driver;
		
	}

	public void touchVisibleElement(By locator) {
		driver.findElement(locator).click();
		
	}

	public void isElementPresent(By locator) {
		try{
			driver.findElement(locator);
		}catch (Exception e){
			Assert.fail("Page did not load or the expected page load element not found "+locator);
		}
		
	}

}
