package com.tests.cleartrip.tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;


public class Setup {

	 public AndroidDriver<WebElement> driver;

	public AndroidDriver<WebElement> launchAppium() throws MalformedURLException {
		File apkFilePath = new File("/Users/practo/Documents/workspace/cleartrip/apps/Cleartrip.apk");
		File app = new File(apkFilePath, "Cleartrip.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("deviceName", "Raj");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("autoDismissAlerts", true);
		capabilities.setCapability("platformVersion", "6.0.1");

		driver=(new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}

}
