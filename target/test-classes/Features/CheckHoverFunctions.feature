Feature: Filter the result from result page

Background: 
Given: Launch the flipkart application
When: Close the popup
Then: it should navigate to the home page

Scenario: To validate the extract result functionality
Given: user enter text in the search box
When: click on the search button
Then: It should navigate to the search result page and display the relevant products  
And: Go to Mens section
And: Select Loafers under footwear
Then: It should display the products based on the applied filters