package Consecutive;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import enums.Activities;

public class Cashbook {

	private String textLocator = "//*[@text='%s']";
	
	
	
	public static String formatXpath( String xpath,String value) {
		return String.format(xpath,value);
	}
	
	public void saloon() {
		
		By salon  = By.xpath(formatXpath(textLocator, Activities.Salon.getActivity()));
	}
	
	public void Testingsaloon() {
		
		By Shop = By.xpath("//*[@text='Tesing Saloon']");
	}
	
	
	
	public void booknow() {
		
		By booknow = By.xpath(formatXpath(textLocator,Activities.BookNow.getActivity()));
	}
	
	
	
	
	
	public void hm() {

	By child = By.xpath("//*[@text='Hair Care men']");
	
	}
	public void hw() {
		
		By women =By.xpath("//*[@text='Hair Care women']");
	}
	
	
	public void ssc() {
	By ssc =By.xpath("//*[@text='ss1']");
	}

	public void Fw() {
	By facialwomen = By.xpath("//*[@text='Facial women']");
	}

	public void booknow1() {
	By booknow2 = By.xpath("//*[@text='Book Now']");
	}
	

	
public void time() {
By time = By.xpath("//*[@text='Select Your Prefered Time']");
}
public void date() {
By date = By.xpath("//*[@text='24th+ Thu']");
}

public void timing() {

By timing =By.xpath("//*[@text='7:11 - 7:21 PM']");
}

public void cash() {

By cash = By.xpath("//*[@text='Cash']");
}

public void conform() {
	By conform = By.xpath(formatXpath(textLocator,Activities.Confirmbooking.getActivity()));
}


public void done() {
By done = By.xpath(formatXpath(textLocator,Activities.Done.getActivity()));
}

public void pay() {
	By onlinepayment = By.xpath("//*[@text='Online Payment']");
}


public void offer() {
By offer = By.xpath("//*[@text='Apply Coupon']");
}

public void flat() {
By flat = By.xpath("//*[@text='FLAT_465328']");
}

public void apply() {
By apply = By.xpath("//*[@text='Apply']");
}

public void proceed() {
By Processtopay = By.xpath(formatXpath(textLocator,Activities.Pay.getActivity()));


}
}





	
	
	
	
