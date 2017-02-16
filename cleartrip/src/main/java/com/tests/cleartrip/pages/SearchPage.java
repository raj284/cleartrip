/**
 * 
 */
package com.tests.cleartrip.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.tests.cleartrip.common.SearchPageFactory;
import com.tests.cleartrip.tests.CommonFunctions;

import io.appium.java_client.android.AndroidDriver;

/**
 * @author Rajesh
 *
 */
public class SearchPage extends SearchPageFactory{
	
	AndroidDriver<WebElement> driver;
	HomePage homePage;
	By departure_date = By.xpath("//*[@resource-id = 'com.cleartrip.android:id/txt_depart_date']");
	By Done_button_calender = By.xpath("//*[@resource-id = 'com.cleartrip.android:id/correctTick']");
	
	
	public SearchPage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToSearch()
	{
		homePage.switchToFlightBook();
		
	}
	
	public void enterTravelDetails() throws InterruptedException
	{
		enterSourceCity();
		enterDestination();
		enterTravelDate();
		searchFlight.click();
	}
	
	
	public void enterSourceCity()
	{
		source.click();
		selectElementInLocationsList(1);
		
	}
	
	public void enterDestination()
	{
		destination.click();
		selectElementInLocationsList(3);
		
	}
	
	public void enterTravelDate()
	{
		driver.findElement(departure_date).click();
		CommonFunctions commonFunctions = new CommonFunctions();
		commonFunctions.waitForElement(driver,Done_button_calender);
		driver.findElement(Done_button_calender).click();
		
	}
	
	
	public void selectElementInLocationsList(int n)
	{
		ArrayList<WebElement> list = new ArrayList<WebElement>();
		list.addAll(driver.findElements(By.xpath("//*[@resource-id = 'com.cleartrip.android:id/localityCode_in_setLocation']")) );
		String cityName = list.get(n).getText();
		String desiredXpath = String.format("//*[@resource-id = 'com.cleartrip.android:id/localityCode_in_setLocation' and @text= '%s']",cityName );
		By city = By.xpath(desiredXpath);
		driver.findElement(city).click();
		 
		}

}
