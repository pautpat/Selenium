Feature: Deal Map Data creation

Scenario: Free CRM create a New Deal Scenario

Given User is already on login page
When title is Free CRM
Then User enters username and password
|username|password|
|sharvutpat|prachi| 
Then User clicks on login button
Then User is on home page
Then User moves to New Deals page
Then User enters deals details
|title|amount| probability | commission |
|test deal1 | 100 | 10 | 20 | 
|test deal2 | 110 | 20 | 30 | 
|test deal3 | 120 | 30 | 40 | 
|test deal4 | 130 | 50 | 60 | 
Then User closes browser