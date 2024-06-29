package SpiceJetTest;

import org.testng.annotations.Test;

import SpiceJet.LoginWithInvalidCredential;
import base.Base1;

public class LoginWithInvalidCredentialTest extends Base1{
	
	@Test
	public void LoginWithInvalidCredentialTst() throws Exception {

		LoginWithInvalidCredential lwic = new LoginWithInvalidCredential(driver);
		// Calling the Login() Method
		lwic.Login();
		// Calling the RadioButton() Method
		lwic.RadioButton();
		// Calling the EmailID() Method
		lwic.EmailID("testemailgv2001@gmail.com");
		// Calling the Password() Method
		lwic.Password("Arun@1999");
		// Calling the LogBT() Method
		lwic.LogBT();

}

}
