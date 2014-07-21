package com.auction.ipad.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.auction.mobile.BaseObject;
import com.auction.mobile.CommonSteps;

public class HomeScreen extends BaseObject{

	WebDriver driver;
	CommonSteps steps;
	
	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		this.steps = new CommonSteps(driver);
		steps.touchVisibleElement(By.name("Residential"));
	}
	
	public MenuScreen touchMenuButton() {
		steps.touchVisibleElement(By.name("preferences"));
		return new MenuScreen(driver);
	}

	@Override
	public By getPageLoadElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
