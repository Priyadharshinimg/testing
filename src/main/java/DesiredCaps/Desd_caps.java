package DesiredCaps;

import java.net.URL;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Desd_caps{
	
	public void automateCustomer() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("ser.dir"+"/app-release.apk"));
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiAutomator2");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}}