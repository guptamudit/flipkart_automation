Feature: Filter the result from result page

Background: 
Given: Launch the flipkart application
When: Close the popup
Then: it should navigate to the home page

Scenario: To validate the extract result functionality
Given: user enter text in the search box
When: click on the search button
Then: It should navigate to the search result page and display the relevant products  
And: user select a product from the search result page
Then: It should navigate to the product details page 
And: user click on the add to cart button
And: select the size of the product
Then: It should add the product to the cart 