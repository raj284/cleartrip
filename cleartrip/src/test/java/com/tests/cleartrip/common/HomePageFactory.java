package com.tests.cleartrip.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;

public class HomePageFactory {
	
AndroidDriver<WebElement> driver;
	
	@FindBy(xpath = "//*[@resource-id = 'com.cleartrip.android:id/fhf_oneway']")
	protected WebElement oneWay;

	@FindBy(xpath = "//*[@resource-id = 'com.cleartrip.android:id/fhf_roundtrip']")
	protected WebElement rounTrip;
	
	
	
}
