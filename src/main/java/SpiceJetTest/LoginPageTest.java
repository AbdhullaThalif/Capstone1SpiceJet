package SpiceJetTest;

import org.testng.annotations.Test;

import base.Base1;
import SpiceJet.LoginPage;

public class LoginPageTest extends Base1{
		
		@Test
		public void LoginTest() throws Exception {

			LoginPage lp = new LoginPage(driver);
			// Calling the Login() Method
			lp.Login();
			// Calling the RadioButton() Method
			lp.RadioButton();
			// Calling the EmailID() Method
			lp.EmailID("testemailgv2000@gmail.com");
			// Calling the Password() Method
			lp.Password("Arun@1990");
			// Calling the LogBT() Method
			lp.LogBT();

	}

}
