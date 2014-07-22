package com.auction.ipad.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.auction.ipad.pageobjects.HomeScreen;
import com.auction.ipad.pageobjects.MenuScreen;
import com.auction.mobile.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test(dataProvider="userdata")
	public void signInUsingValidCredentials(String username,String password) throws InterruptedException{
		Thread.sleep(1000);
		System.out.println(username + password);
		HomeScreen homeScreen = new HomeScreen(getDriver());
		MenuScreen menu = homeScreen.touchMenuButton();
		menu.enterTextEmail(username);
		menu.enterTextPassword(password);
		menu.touchLogInButton();
		menu.touchLogoutButton();
	}
//	
//	@Test(dataProvider="userdata")
//	public void testdata(String a,String b) throws InterruptedException{
//		System.out.println(a+"    "+b);
//	}

	
	@DataProvider(name="userdata")
	public Object[][] getUserData(){

		String[] usernames = getUsernames();
			
		String passwords[] = getPasswords();
		
		Object[][] allNames = new Object[usernames.length][passwords.length];

		for (int i=0;i<usernames.length;i++){
			String[] names = new String[2];
			names[0]=usernames[i];
			names[1]=passwords[i];
			allNames[i]=names;
		}

		return allNames;

	}




}
