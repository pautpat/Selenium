Feature: Free CRM Login Page

# you use scenario outline when you do data driven testing using examples kyword otherwise use Scenario 

Scenario Outline: Free CRM Login Test Page

Given User is already on login page
When title is Free CRM
#Then User enters "sharvutpat" and "prachi"
#Then User enters username and password
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on home page
Then close browser


Examples:
 |username|password|
 |hparvi|bujjikrish786|
 |sharvutpat|prachi|
 |orrjiejr|rjerj|