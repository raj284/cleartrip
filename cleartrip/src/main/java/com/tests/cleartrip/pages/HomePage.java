package com.tests.cleartrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import com.tests.cleartrip.common.HomePageFactory;
import com.tests.cleartrip.tests.CommonFunctions;

import io.appium.java_client.android.AndroidDriver;

public class HomePage extends HomePageFactory{
	
	AndroidDriver<WebElement> driver;
	CommonFunctions commonFunctions;
	
	// Example of Using By
	By switcher = By.xpath("//*[@resource-id='com.cleartrip.android:id/switcher_image']");
	By allow = By.xpath("//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']");
	By greetingMessage = By.xpath("//*[@resource-id = 'com.cleartrip.android:id/header']");
	By heading_local = By.xpath("//*[@resource-id = 'com.cleartrip.android:id/original_local_text']");
	By heading_travel = By.xpath("//*[@resource-id = 'com.cleartrip.android:id/original_travel_text']");
	
	public HomePage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String greetingMessage()
	{
		
		commonFunctions = PageFactory.initElements(driver, CommonFunctions.class);
		commonFunctions.waitForElement(driver, greetingMessage);
		String message = driver.findElement(greetingMessage).getText();
		return message;
	}
	
	
	public void acceptNativePermission()
	{  
		commonFunctions = PageFactory.initElements(driver, CommonFunctions.class);
		commonFunctions.waitForElement(driver, allow);
		driver.findElement(allow).click();
		
	}
	

	public  void switchToFlightBook()
	{
		acceptNativePermission();
		commonFunctions = PageFactory.initElements(driver, CommonFunctions.class);
		commonFunctions.waitForElement(driver, switcher);
		driver.findElement(switcher).click();
		System.out.println("Example of pagefactory");
				
		
	}
	
}
