package com.tests.cleartrip.tests;

import org.testng.annotations.Test;

import com.tests.cleartrip.pages.HomePage;
import com.tests.cleartrip.pages.SearchPage;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchPageTest extends Setup {
  
	public AndroidDriver<WebElement> driver;
@Test
  public void VerifySearchPage() throws InterruptedException {
	SearchPage searchpage = new SearchPage(driver);
	searchpage.enterTravelDetails();
		
  }
  
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  System.out.println("Starting setup");
	  Setup setup = new Setup();
	  this.driver =  setup.launchAppium();
	  System.out.println("Setup is done");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test case completed");
  }

}
