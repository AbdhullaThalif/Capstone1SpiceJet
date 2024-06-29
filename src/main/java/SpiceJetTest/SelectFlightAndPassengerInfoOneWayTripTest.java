package SpiceJetTest;

import java.time.Duration;

import org.testng.annotations.Test;

import SpiceJet.SelectFlightAndPassengerInfoOneWayTrip;
import base.Base1;

public class SelectFlightAndPassengerInfoOneWayTripTest extends Base1{
	
	@Test
	public void SelectFlightAndPassengerInfoOneWayTripTt() throws Exception {
		
		SelectFlightAndPassengerInfoOneWayTrip sfopo = new SelectFlightAndPassengerInfoOneWayTrip(driver);
		// Calling the OneWay() Method
		//ot.OneWay();
		// Calling the From() Method
		sfopo.From();
		// Calling the To() Method
		sfopo.To();
		// Calling the DepartureDate() Method
		sfopo.DepartureDate();
		// Calling the Category() Method
		sfopo.Category();
		// Calling the SearchFlight() Method
		sfopo.SearchFlight();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//sfopo.Confirmation();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Calling the Continue() Method
		sfopo.Continue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Calling the ContactDetails() Method
		sfopo.ContactDetails("Arun", "Raj", "9962019366", "testemailgv2000@gmail.com", "Chennai");
		// Calling the PassengerDetails() Method
		sfopo.PassangerDetails("Arun", "Raj", "9962019366", "2114o2176");
        // Calling the Submit1() Method
		sfopo.Submit1();
		// Calling the Submit2() Method
		sfopo.Submit2();
	}

}
