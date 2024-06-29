package SpiceJetTest;

import org.testng.annotations.Test;

import SpiceJet.ValidateBookingPageFields;
import base.Base1;

public class ValidateBookingPageFieldsTest extends Base1{
	
	@Test
	public void ValidateBookingPageFieldsTst() throws Exception {

		ValidateBookingPageFields ch = new ValidateBookingPageFields(driver);
		// Calling the CheckIn() Method
		ch.CheckIn();
		// Calling the FlightStatus() Method
		ch.FlightStatus();
		// Calling the ManageBooking() Method
		ch.ManageBooking();

}
}
