package Bannerimage;

import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class bannerpages implements bannerscreen {
	  
//AndroidDriver();
	@Test
	public void  access() {
		//using the app only xpath
	By access = By.xpath("*//*[@text='using the app'");
    //driver.findElement(access).click();
	
	}
	

	@Test
	public void page() {
		//update the app xpath
		By Update = By.xpath("//*//[@class='android.webkit.WebView']");
		//driver.findElement(Update).close();
		
	}
	
	
	@Test
	
	public void onlythistime() {
		//only this time xpath 
		By back = By.xpath("//*[@text='Only this time']");
	}
	
	
	@Test
	
	public void deny() {
		//deny xpath 
		By deny = By.xpath("//*[@text='Deny']");
	}
	
	@Test
	
	public void next() {
		//
		By Next = By.xpath("//*[@text='Next']");
	//driver.findElement(Next).click();
	}
	
	@Test
	
	public void next2() {
		//
		By Next = By.xpath("//*[@text='Next']");
	//driver.findElement(Next).click();
	}
	
	
	public void previous() {
		//previous xpath 
		By previous = By.xpath("//*[@text='Previous']");
	}
	
	public void start() {
		//start xpath 
		By start = By.xpath("//*[@text='Start']");
	}
	
	
}

