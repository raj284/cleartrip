package com.tests.cleartrip.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class SearchPageFactory {

	
	AndroidDriver<WebElement> driver;
	
	@FindBy(xpath = "//*[@resource-id = 'com.cleartrip.android:id/fhf_oneway']")
	protected WebElement oneWay;
	
	@FindBy(xpath = "//*[@resource-id = 'com.cleartrip.android:id/fhf_roundtrip']")
	protected WebElement rounTrip;
	
	@FindBy(xpath = "//*[@resource-id='com.cleartrip.android:id/txt_from_city']")
	protected WebElement source;
	
	@FindBy(xpath = "//*[@resource-id='com.cleartrip.android:id/txt_to_city']")
	protected WebElement destination;
	
	@FindBy(xpath = "//*[@resource-id='com.cleartrip.android:id/txt_depart_date']")
	protected WebElement departDate;
	
	@FindBy(xpath = "//*[@resource-id='com.cleartrip.android:id/fhf_btn_search_flights']")
	protected WebElement searchFlight;
	
	
	
	
	
	
	
}
