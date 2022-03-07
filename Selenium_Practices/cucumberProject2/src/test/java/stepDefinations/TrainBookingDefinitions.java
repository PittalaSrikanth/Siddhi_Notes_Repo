package stepDefinations;

import io.cucumber.java.en.*;

public class TrainBookingDefinitions {
	 
    @Given("I want to book one way train ticket from Dublin to Cork on 10th June for 2 adults and 2 kids")
       public void hotelWithoutBreakfast(){
            System.out.println("I want to book one way train ticket from Dublin to Cork on 10th June for 2 adults and 2 kids");
       }
      
    @Then("IrishRail should provide me options to book train ticket for the specified date")
       public void Trivago(){
            System.out.println("IrishRail should provide me options to book train ticket for the specified date");
       }
 
}