Feature: DemoQa tests
  
  Scenario: Check dropdowns test
    Given Open demoqa site
    When Select "8" in 'Colors' dropdown
    Then Check 'Colors' dropdown has "Indigo" value
    When Select "opel" and "saab" in 'Cars' dropdown
    Then Check 'Cars' dropdown have "Saab, Opel" values
    When Select "Group 2, option 1" value in 'Groups' dropdown
    Then Check 'Groups' dropdown has "Group 2, option 1" value
    When Select "Prof." value in 'Titles' dropdown
    Then Check 'Titles' dropdown has "Prof." value
    When Select "Green" and "Blue" in 'Multi Colors' dropdown
    Then Check 'Multi Colors' dropdown have "Green, Blue" values