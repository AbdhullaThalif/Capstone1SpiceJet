package SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class ValidateBookingPageFields extends Base1{
	
	// Constructor Method
			public ValidateBookingPageFields(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'][normalize-space()='check-in']")
			WebElement Checkin;
			@FindBy(xpath="//div[contains(text(),'flight status')]")
			WebElement FlightST;
			@FindBy(xpath="//div[contains(text(),'manage booking')]")
			WebElement ManageBK;
			
			
			
			public void CheckIn(){
				
				String x = Checkin.getText();
				System.out.println(x);
				if (x.equalsIgnoreCase("check-in")) {
					System.out.println("Check-In Field Is Available");
				} else {
					System.out.println("Check-In Field Is Not Available");
				}
				
				
			}
			
            public void FlightStatus(){
				
				String x = FlightST.getText();
				System.out.println(x);
				if (x.equalsIgnoreCase("flight status")) {
					System.out.println("Flight Status Field Is Available");
				} else {
					System.out.println("Flight Status Field Is Not Available");
				}
				
				
			}
			
            public void ManageBooking(){
				
  				String x = ManageBK.getText();
  				System.out.println(x);
  				if (x.equalsIgnoreCase("manage booking")) {
  					System.out.println("Manage Booking Field Is Available");
  				} else {
  					System.out.println("Manage Booking Field Is Not Available");
  				}
  				
  				
  			}
  			
}
