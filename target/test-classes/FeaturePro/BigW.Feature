Feature: To validate search functionality


Background:
Given user is on BigW search page

  Scenario: To verify the search box functionality
    When user enter iphone
    When user enter watch
    And user enter shirt
    
    Scenario: To verify select box functionality
    When user select baby section
