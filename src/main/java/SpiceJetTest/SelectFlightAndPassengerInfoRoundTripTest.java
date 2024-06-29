package SpiceJetTest;

import java.time.Duration;

import org.testng.annotations.Test;

import SpiceJet.SelectFlightAndPassengerInfoRoundTrip;
import base.Base1;

public class SelectFlightAndPassengerInfoRoundTripTest extends Base1{
	
	
	@Test
	public void SelectFlightAndPassengerInfoRoundTripTst() throws Exception {
		
		SelectFlightAndPassengerInfoRoundTrip sfopr = new SelectFlightAndPassengerInfoRoundTrip(driver);
		// Calling the RoundWay() Method
		sfopr.RoundTP();
		// Calling the From1() Method
		sfopr.From1();
		// Calling the To1() Method
		sfopr.To1();
		Thread.sleep(1000);
		// Calling the DepartureDate1() Method
		sfopr.DepartureDate1();
		// Calling the ReturnDate1() Method
		sfopr.ReturnDate1();
		// Calling the Category1() Method
		sfopr.Category1();
		// Calling the SearchFlight1() Method
		sfopr.SearchFlight1();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Calling the Continue() Method
		sfopr.Continue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Calling the ContactDetails() Method
		sfopr.ContactDetails("Arun", "Raj", "9962019366", "testemailgv2000@gmail.com", "Chennai");
		// Calling the PassengerDetails() Method
		sfopr.PassangerDetails("Arun", "Raj", "9962019366", "2114o2176");
		// Calling the Submit1() Method
		sfopr.Submit1();
		// Calling the Submit2() Method
		sfopr.Submit2();

}

}
