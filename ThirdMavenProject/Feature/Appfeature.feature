Feature: Google Search
Scenario: Search a product
Given I have search field on Google Page
When I search for a product with name "Apple Macbook pro" and price 1000 
Then Product with "Apple Macbook pro" Should be displayed

