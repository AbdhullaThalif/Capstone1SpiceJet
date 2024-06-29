package SpiceJet;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class OneWayTrip extends Base1{
	

    // Constructor Method
			public OneWayTrip(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
			// Defined  the web element using the @FindBy
			@FindBy(xpath="(//*[name()='circle'])[2]")
			WebElement Oneway;
			@FindBy(xpath="//div[@data-testid='to-testID-origin']//input[@type='text']")
			WebElement From;
			@FindBy(xpath="//div[normalize-space()='Chennai International Airport']")
			WebElement FromD;
			@FindBy(xpath="(//input[@type='text'])[2]")
			WebElement To;
			@FindBy(xpath="//div[normalize-space()='Indira Gandhi International Airport']")
			WebElement ToA;
			@FindBy(xpath="(//*[name()='path'])[17]")
			WebElement DateR;
			@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[13]")
			WebElement DateBT;
			@FindBy(xpath="(//div[text()='26'])[2]")
            WebElement DT;
			@FindBy(xpath="(//*[name()='circle'])[8]")
			WebElement Std;
			@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
			WebElement SRF;
			@FindBy(xpath="(//*[name()='rect'])[2]")
			WebElement StdC;
			@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
			WebElement Continue;
			
			
			
			public void From() {
				
				// Click on the From Field
				From.click();
				// Click on the Chennai International Airport value
				FromD.click();
			}
			
           public void To() {
				
				// Click on the To Field
				To.click();
				// Click on the Indira Gandhi International Airport value
				ToA.click();
			}
           
           public void DepartureDate() throws Exception {
        	   
				// Click on the Departure Date
				Thread.sleep(1000);
				DT.click();
			}
			
           public void Category() {
				// Click on the Students Option
				Std.click();

           }
           
           public void SearchFlight() throws Exception {
			// Click on the Search Flight Option
        	   Thread.sleep(1000);
        	   SRF.click();
        	   Thread.sleep(1000);
        	// Click on the dialogue
        	   StdC.click();
        	// Click on the Continue Option
        	   Continue.click();
          }
}
