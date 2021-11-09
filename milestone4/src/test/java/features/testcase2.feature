Feature: To search an Item

Scenario: To search for an item
Given Browser initialized
And User is on homepage
When user search for "Antibacterial"
Then System seaches for item
And Counts the number of matches
And driver closed