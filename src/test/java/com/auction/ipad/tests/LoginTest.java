package com.auction.ipad.tests;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.auction.ipad.pageobjects.HomeScreen;
import com.auction.ipad.pageobjects.MenuScreen;
import com.auction.mobile.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test(dataProvider="userdata")
	public void signInUsingValidCredentials() throws InterruptedException{
		Thread.sleep(1000);
		HomeScreen homeScreen = new HomeScreen(getDriver());

		MenuScreen menuScreen = homeScreen.touchMenuButton();
		Thread.sleep(5000);
	}

	@DataProvider(name="userdata")
	public Object[][] getUserData(){

		String[] usernames = testProps.getProperty("usernames").split(",");
			
		String passwords[] = testProps.getProperty("passwords").split(",");
		
		Object[][] allNames = new Object[usernames.length][passwords.length];

		for (int i=0;i<usernames.length;i++){
			String[] names = new String[2];
			names[0]=usernames[0];
			names[1]=passwords[0];
			allNames[0]=names;
		}

		return allNames;

	}




}
