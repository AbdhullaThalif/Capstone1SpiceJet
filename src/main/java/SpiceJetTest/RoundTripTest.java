package SpiceJetTest;

import org.testng.annotations.Test;

import base.Base1;
import SpiceJet.RoundTrip;

public class RoundTripTest extends Base1{
	
	
	@Test
	public void RoundTripTest1() throws Exception {
		
		RoundTrip rt = new RoundTrip(driver);
		// Calling the RoundTrip() Method
		rt.RoundTP();
		// Calling the From1() Method
		rt.From1();
		// Calling the To1() Method
		rt.To1();
		Thread.sleep(1000);
		// Calling the DepartureDate1() Method
		rt.DepartureDate1();
		// Calling the ReturnDate1() Method
		rt.ReturnDate1();
		// Calling the Category1() Method
		rt.Category1();
		// Calling the SearchFlight1() Method
		rt.SearchFlight1();

}

}
