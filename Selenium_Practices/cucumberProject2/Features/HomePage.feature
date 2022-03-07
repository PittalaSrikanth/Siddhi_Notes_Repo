Feature: Home page validation
   
Background:
   Given User Navigates to HRM login page
   And User login with valid credentials
  
   @ValidQuickLaunch
   Scenario Outline: Login with valid credentials to check QuickLanuch options  - Feature 2, Scenario -1
      
   When User is in Dashboard page
     Then there are valid QuickLaunch options '<options>'
          
    Examples: 
        |options                  |
        |Assign Leave             |
        |Leave List               |
  
      
    @ValidLegendOptions   
    Scenario Outline: Login with valid credentials to check Manu Options - Feature 2, Scenario -2
      
   When User is in Dashboard page
     Then there are valid Legend options '<legendOptions>'
          
    Examples: 
        |legendOptions               |
        |Administration              |