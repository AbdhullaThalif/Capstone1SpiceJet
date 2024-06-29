package SpiceJet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class SelectFlightAndPassengerInfoRoundTrip extends Base1{
	

	// Constructor Method
				public SelectFlightAndPassengerInfoRoundTrip(WebDriver driver) {
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
				
				@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
				WebElement ContinueC;
				@FindBy(xpath="(//*[name()='rect'])[2]")
				WebElement SRFTC1;
				@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
				WebElement Continue1;
				@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-1x93onp']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'][normalize-space()='Mr']")
				WebElement Title;
				@FindBy(xpath="(//input[@type='text'])[1]")
				WebElement FirstName;
				@FindBy(xpath="(//input[@type='text'])[2]")
				WebElement LastName;
				@FindBy(xpath="(//input[@type='text'])[3]")
				WebElement MobileNumber;
				@FindBy(xpath="(//input[@type='text'])[4]")
				WebElement Email;
				@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-n6v787 r-1e081e0 r-oyd9sg'][normalize-space()='India'])[1]")
				WebElement Country;
				@FindBy(xpath="(//input[@type='text'])[5]")
				WebElement City;
				@FindBy(xpath="(//div[@class='css-1dbjc4n r-1habvwh r-19fu0aa r-1loqt21 r-mabqd8 r-1777fci r-1yt7n81 r-1otgn73'])[1]")
				WebElement Title1;
				@FindBy(xpath="(//input[@type='text'])[6]")
				WebElement FirstName1;
				@FindBy(xpath="(//input[@type='text'])[7]")
				WebElement LastName1;
				@FindBy(xpath="(//input[@type='text'])[8]")
				WebElement MobileNumber1;
				@FindBy(xpath="(//input[@type='text'])[9]")
				WebElement StudentID;
				@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[1]")
				WebElement Continue2;
				@FindBy(xpath="//span[@id='skipfrompopup']")
				WebElement Close;
				@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
				WebElement Continue3;
				
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
				
               public void To1() throws Exception {
					
					// Click on the To Field
					To1.click();
					Thread.sleep(1000);
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
					SRFT.click();
					Thread.sleep(1000);
					SRFTC.click();
				    Continue.click();

              }
           	
           	public void Continue()
           	
           	{
           		// Click on the continue button
           		ContinueC.click();
           	}
           	
           	
           	public void ContactDetails(String FName, String LName, String MNumber, String email, String CName) {
           	
           		// Click the First Name Field ad Enter the Value
           		FirstName.sendKeys(FName);
           		// Click the Last Name Field and Enter the Value
           		LastName.sendKeys(LName);
           		// Click the Mobile Number Field and Enter the Value
           		MobileNumber.sendKeys(MNumber);
           		// Click the Email Field and Enter the Value
           		Email.sendKeys(email);
           		// Click the City Field and Enter the Value
           		City.sendKeys(CName);
           	}
           	
           	
           	public void PassangerDetails(String F1Name, String L1Name, String M1Number, String StdID) {
           		     
           			// Click the First Name Field and Enter the Value
           			FirstName1.sendKeys(F1Name);
           			// Click the Last Name Field and Enter the Value
           			LastName1.sendKeys(L1Name);
           			// Click the Mobile Number Field and Enter the Value
           			MobileNumber1.sendKeys(M1Number);
           			// Click the Student Field and Enter the Value
           			StudentID.sendKeys(StdID);
           		
           	}
           	
              public void Submit1()
           	
           	{
           		// Click on the continue button
           		Continue2.click();
           	}
              
           	
             public void Submit2()
           	
           	{
           	   //Click on the continue button
           	   JavascriptExecutor executor = (JavascriptExecutor) driver;
           	   executor.executeScript("arguments[0].click();", Continue3);
           	  // Click on the Close button
           	   Close.click();
           	}


}
