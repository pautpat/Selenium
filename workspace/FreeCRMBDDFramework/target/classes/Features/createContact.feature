Feature: Create new contact

Scenario Outline: Free CRM create new contact test

Given User is already on login page
When title is Free CRM
#Then User enters "sharvutpat" and "prachi"
#Then User enters username and password
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on home page
When User clicks on Contact tab and select new contact
Then Create new contact form opens
When User enters "<firstName>" and "<lastName>" and "<position>"
When User clicks on Save button
Then Close the browser

Examples:
 |username|password|firstName|lastName|position|
 |sharvutpat|prachi|Akshay|Kumar|Sales Manager|
 |sharvutpat|prachi|Akshay|Khanna|Sales Director|

