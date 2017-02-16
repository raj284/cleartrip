package com.tests.cleartrip.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.tests.cleartrip.tests.CommonFunctions;
import com.tests.cleartrip.tests.SearchPageTest;
import com.tests.cleartrip.tests.Setup;

import io.appium.java_client.android.AndroidDriver;

public class SearchResultPage extends Setup {
	
    AndroidDriver<WebElement> driver;
	private SearchPage searchpage;
	private HomePage homepage;
	private CommonFunctions commonFunctins;
	
	
	
	public SearchResultPage(AndroidDriver<WebElement> driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
