package com.auction.ipad.tests;

import java.util.ArrayList;
import java.util.List;

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
		
		//loadPropsFile("data.properties");
		
		String usernames = "abc,lkm,opq,rst";
		String password = "abc,lkm,opq,rst";
		
		Object[][] allNames = new Object[usernames.split(",").length][usernames.split(",").length];
		
		for (int i=0;i<4;i++){
		String[] names = new String[2];
		names[0]=usernames.split(",")[0];
		names[1]=password.split(",")[0];
		allNames[0]=names;
		}
		
		
		return allNames;

	}
	
	

	
}
