package SpiceJetTest;

import org.testng.annotations.Test;

import base.Base1;
import SpiceJet.OneWayTrip;

public class OneWayTripTest extends Base1{
	
	@Test
	public void OneWayTest() throws Exception {
		
		OneWayTrip ot = new OneWayTrip(driver);
		// Calling the From() Method
		ot.From();
		// Calling the To() Method
		ot.To();
		// Calling the DepartureDate() Method
		ot.DepartureDate();
		// Calling the Category() Method
		ot.Category();
		// Calling the SearchFlight() Method
		ot.SearchFlight();
	}


}
