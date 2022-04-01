Feature: Add to cart functionality

Scenario: user wants to select product from women section
Given user select tshirt and added to cart 
When user clicks on continue shopping1
And user select blouse and added to cart
Then user validate the current page1

Scenario: user wants to select product from dresses section
Given user select casual dress and added to cart
When user clicks on continue shopping2
And user select evening dress and added to cart
And user clicks on continue shopping3
And user select summer dress and added to cart
Then user validate the current page2

Scenario: user wants to check the cart
Given user will check the product on cart
When user will take screenshot of the cartpage 

Scenario: user goes back to login page and check other functions
Given user wants to go back to login page
When user check order history and details and return to homepage
Then user validate the home page