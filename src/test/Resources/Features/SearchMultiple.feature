Feature: To validate the flipkart application

Background: 
Given: Launch the flipkart application
When: Close the popup
Then: it should navigate to the home page

Scenario Outline: To validate the search functionality
Given: user enter "<product>" in the search box
When: click on the search button
Then: It should navigate to the search result page and display the relevant products
And: a screenshot of the page is taken and stored in the specified "<path>"

Examples:
| product       | path           |
| mobile        | Resources/Screenshotss/mobile.png |
| laptop        | Resources/Screenshots/laptop.png |
| headphones    | Resources/Screenshots/headphones.png |
| smart watch   | Resources/Screenshots/smartwatch.png |

