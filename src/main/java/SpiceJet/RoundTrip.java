package SpiceJet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class RoundTrip extends Base1{
	

	// Constructor Method
				public RoundTrip(WebDriver driver) {
					this.driver=driver;
					PageFactory.initElements(driver, this);
				}

				// Defined  the web element using the @FindBy
				@FindBy(xpath="(//*[name()='circle'])[3]")
				WebElement RoundTrip;
				@FindBy(xpath="//div[@data-testid='to-testID-origin']//input[@type='text']")
				WebElement From1;
				@FindBy(xpath="//div[normalize-space()='Chennai International Airport']")
				WebElement FromD1;
				@FindBy(xpath="(//input[@type='text'])[2]")
				WebElement To1;
				@FindBy(xpath="//div[normalize-space()='Indira Gandhi International Airport']")
				WebElement ToA1;
				@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[18]")
				WebElement DateDQ;
				@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[13]")
				WebElement DateDD;
				@FindBy(xpath="(//div[text()='26'])[2]")
                WebElement DD;
				@FindBy(xpath="(//div[contains(text(),'Select Date')])[1]")
				WebElement DateRD;
				@FindBy(xpath="(//div[text()='28'])[2]")
                WebElement RD;
				@FindBy(xpath="(//*[name()='circle'])[8]")
				WebElement Stud;
				@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
				WebElement SRFT;
				@FindBy(xpath="(//*[name()='rect'])[2]")
				WebElement SRFTC;
				@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
				WebElement Continue;
				
				public void RoundTP() {
					// Click on the RoundWay Option
					RoundTrip.click();

                }
				
				public void From1() {
					
					// Click on the From Field
					From1.click();
					// Click on the Chennai International Airport value
					FromD1.click();
				}
				
               public void To1() {
					
					// Click on the To Field
					To1.click();
					// Click on the Indira Gandhi International Airport value
					ToA1.click();
				}
               
               public void DepartureDate1() throws Exception {
					
            	// Click on the Departure Date
            	   DD.click();
				}
				
               public void ReturnDate1() throws Exception {
					
					// Click on the Date button
            	   JavascriptExecutor executor = (JavascriptExecutor) driver;
            	   executor.executeScript("arguments[0].click();", DateRD);
					// Click on the Departure Date
            	   Thread.sleep(1000);
					RD.click();
				}
               
               public void Category1() {
					// Click on the Students Option
					Stud.click();

               }
               
               public void SearchFlight1() throws Exception {
					// Click on the Students Option
            	   Thread.sleep(1000);
					SRFT.click();
					Thread.sleep(1000);
					// Click on the dialogue
					SRFTC.click();
					// Click on the Continue Option
				    Continue.click();

              }


}
