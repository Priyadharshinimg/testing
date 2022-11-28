package searchpagemodule;

import org.openqa.selenium.By;

public class searchmodule {

	
	//shop name
	public void kms() {
	By kms = By.xpath("//*[@text='0Kms']");
	}
	
	public void shop() {
	By newshop = By.xpath("//*[@text='New']");
	}
	
	public void offer() {
	By offer = By.xpath("//*[@text='Exclusive offer available Upto to 20% OFF']");
	}
}
