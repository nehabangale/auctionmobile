package com.auction.ipad.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.auction.mobile.BaseObject;
import com.auction.mobile.CommonSteps;

public class MenuScreen extends BaseObject{

	WebDriver driver;
	CommonSteps steps;
	
	public MenuScreen(WebDriver driver) {
		this.driver = driver;
		this.steps = new CommonSteps(driver);
		steps.isElementPresent(getPageLoadElement());
	}

	@Override
	public By getPageLoadElement() {
		return By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[7]");
	}
	
	
}
