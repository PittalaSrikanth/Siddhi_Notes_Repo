Feature: Book Train Ticket
  
@BookOneWayTrain
Scenario: Book train ticket for one way
  
	Given I want to book one way train ticket from Dublin to Cork on 10th June for 2 adults and 2 kids
	Then IrishRail should provide me options to book train ticket for the specified date