package com.tests.cleartrip.tests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.tests.cleartrip.pages.HomePage;
import com.tests.cleartrip.tests.Setup;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;



public class HomePageTest extends Setup {
  
	private AndroidDriver<WebElement> driver;

	
@Test
  public void verifyGreeting() {
	
	HomePage homepage = new HomePage(driver);
	homepage.acceptNativePermission();
	String greetingMessage = homepage.greetingMessage();
	Assert.assertTrue(greetingMessage.contains("Good"));
	homepage.switchToSearch();
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
	  driver.quit();
  }

}
