package SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base1;

public class LoginWithInvalidCredential extends Base1{
	
	// Constructor Method
			public LoginWithInvalidCredential(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="//div[contains(text(),'Login')]")
			WebElement Login;
			@FindBy(xpath="(//*[name()='circle'])[13]")
			WebElement RadioBT;
			@FindBy(xpath="//input[@type='email']")
			WebElement Email;
			@FindBy(xpath="//input[@type='password']")
			WebElement Password;
			@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
			WebElement LogBT;
			
			public void Login() {
				// Click on the Login button
				Login.click();
				
			}
			
			public void RadioButton() {
				// Click on the Login button
				RadioBT.click();
				
			}
			
			public void EmailID(String emailid)
			{
				// Input the email id value in the email id field
				Email.sendKeys(emailid);
			}
			
			public void Password(String PSW)
			{
				// Input the Password value in the Password field
				Password.sendKeys(PSW);
			}
			
			public void LogBT() {
				// Click on the LogIn button
				LogBT.click();
				
			}


}
