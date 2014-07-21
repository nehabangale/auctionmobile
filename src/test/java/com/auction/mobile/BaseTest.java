package com.auction.mobile;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

	WebDriver driver=null;

	/*
	 * Setup should do things that are just required to be done once for the entire test run
	 * like: 
	 * 		- Downloading the app
	 * 		- Reading data related to tests
	 * 		
	 */
	@BeforeSuite
	public void setup(){
		
	}
	
	/*
	 * Before method should contain that is required to be done before the starting of each test case
	 * like:
	 * 		- Instantiating Appium driver
	 * 		- Instantiating WebDriver if required
	 * 		- Setting up the base state of the application after launch
	 */
	@BeforeMethod
	public void setupLocal() throws MalformedURLException{
		File appDir = new File("/Users/obapat/Desktop/THISLIFE");
		File app = new File(appDir, "Auction.com.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.VERSION, "7.0");
		capabilities.setCapability("app", "com.auction.ipad.adhoc");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPad");
		capabilities.setCapability("autoAcceptAlerts", true);
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown(){
		if (driver!=null)
			driver.quit();
	}
	
	public WebDriver getDriver(){
		return driver;
	}
}
