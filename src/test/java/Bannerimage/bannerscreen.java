package Bannerimage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public final class bannerscreen extends bannerpages{
	
	
	

public static void main(String[]args) throws MalformedURLException {
	
		DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/app-release.apk");
	//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);


}


	
}
