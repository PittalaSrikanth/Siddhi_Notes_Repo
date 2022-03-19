# Author Srikanth

@smokeFeature
Feature: Test Login functionality

  @smokeScenario
  Scenario: Login with valid credentials
    Given User is on login page
    When user enter username and password
    And click on login button
    Then user is navigated to home page

  #Scenario Outline: Login with valid credentials Parameters
    #Given User is on login page
    #When user enter <username> and <password>
    #And click on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| username | password |
      #| admin    | admin123 |
      #| admin    | admin123 |
