Feature: Verifying Adactin details
Scenario: Verifying Adactin login details with valid credentials
Given User is on the AdactinHotel Page
When User should enter username and password
And User should click login button 
Then User should verify success 