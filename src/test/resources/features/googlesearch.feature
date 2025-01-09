Feature: W3School and Google tests
  
  Scenario: Check searching test
    Given Open w3school site
    When Copy word from title
    And Open google site
    And Paste the copied word from title
    Then Check all search results have pasted "tutorial" word
