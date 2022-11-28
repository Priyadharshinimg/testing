package HomePage;

import org.openqa.selenium.By;

public class HomePageModule {

	public void locationbutton(){
		//location button 
		By location = By.xpath("//*[@class='android.widget.TextView']");
	}
	
	public void notification() {
		
		By notifed = By.xpath("//*[@class='android.widget.ImageView']");
	}
	
 public void homemodule()
 {
	 
	 By home = By.xpath("//*[@text='Home']");
 }
 
 public void search() {
	 
	By search = By.xpath("//*[@text='Search']");
 }
 
 public void Offer() {
	 
	 By offer = By.xpath("//*[@text='Offers']");
 }
 
 
 public void Profile() {
	 
	 By profile = By.xpath("//*[@text='Profile']");
 }
}
