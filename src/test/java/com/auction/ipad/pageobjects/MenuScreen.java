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

	public void enterTextEmail(String username)
	{
		steps.enterText(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[1]/UIATextField[1]"),username);
	}
	
	public void enterTextPassword(String password)
	{
		steps.enterText(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]/UIASecureTextField[1]"),password);
		//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[2]/UIASecureTextField[1]
	}
	
	public void touchLogoutButton()
	{
		steps.touchVisibleElement(By.name("Log out"));
	}
	
	public void touchLogInButton()
	{
		steps.touchVisibleElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[7]"));
	}
	
}
