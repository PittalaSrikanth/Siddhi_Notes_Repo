package stepDefinations;

import io.cucumber.java.en.*;

public class FlightBookingDefinitions {
    
    @Given("I want to book one way flight ticket from Dublin to London on 22nd July for 2 adults and 2 kids")
       public void singleTrip(){
            System.out.println("I want to book one way flight ticket from Dublin to London on 22nd July for 2 adults and 2 kids");
       }
      
    @Then("TripAdvisor should provide me options to book flight ticket")
       public void TripAdvisor(){
            System.out.println("TripAdvisor should provide me options to book flight ticket");
       }
     
    @Given("I want to book roundtrip flight ticket from Dublin to India on 30th June and return 10th July for 2 adults and 1 kid")
       public void roundTrip(){
            System.out.println("I want to book one way flight ticket from Dublin to London on 22nd July for 2 adults and 2 kids");
       }
}
