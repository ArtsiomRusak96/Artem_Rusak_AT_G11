Feature: Booking tests

  Scenario: Booking in Paris test
    Given Open booking site
    When Enter "Paris" into destination field
    And Set desired dates - start in 3 days and duration 7 days
    And Set desired 2 persons quantity
    And Set desired 1 rooms quantity
    And Click 'Search' button
    And Set filter by 5 stars hotel
    And Set sorting by ascending
    Then Check the first hotel has 5 stars

  Scenario: Booking in Prague test
    Given Open booking site
    When Enter "Prague" into destination field
    And Set desired dates - start in 10 days and duration 4 days
    And Click 'Search' button
    And Set filter by 9+ rate
    And Open the first hotel in filtered list
    Then Check the opened hotel rate more than 9

  Scenario: Booking in London test
    Given Open booking site
    When Enter "London" into destination field
    And Set desired dates - start in 6 days and duration 3 days
    And Click 'Search' button
    And For hotel № "10" - change background color on "green" and title color on "red"
    And Take screenshot with name - "screenshot.png"
    Then Check the created "screenshot.png" screenshot

  Scenario: Booking - currency and language tooltips test
    Given Open booking site
    When Hover on currency
    Then Currency tooltip appears
    When Hover on language
    Then Language tooltip appears