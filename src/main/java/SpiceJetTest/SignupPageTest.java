package SpiceJetTest;

import org.testng.annotations.Test;

import base.Base1;
import SpiceJet.SignupPage;


public class SignupPageTest extends Base1 {
	
	@Test
	public void SignupTest() throws Exception {

		SignupPage sp = new SignupPage(driver);
		// Calling the Sinup() Method
		sp.Signup();
		// Calling the Switch() Method
		sp.Switch();
		// Calling the Title() Method
		sp.Title();
		// Calling the EnterData() Method
		sp.EnterData("Arun", "Raj");
		// Calling the Country() Method
		sp.Country();
		// Calling the Date() Method
		sp.Date();
		// Calling the DateOfBirth() Method
		sp.DateOfBirth();
		// Calling the MobileNumber() Method
		sp.MobileNumber("9962019366");
		// Calling the Email() Method
		sp.Email("testemailgv2000@gmail.com");
		// Calling the Password() Method
		sp.Password("Arun@1990");
		// Calling the Term() Method
		sp.Term();
		// Calling the Submit Method
		sp.Sumbit();
	}

}
