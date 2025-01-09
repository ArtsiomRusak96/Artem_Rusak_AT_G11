Feature: DemoQa tests
  
  Scenario: Check dropdowns test
    Given Open demoqa site
    When Select "8" in 'Colors' dropdown
    Then Check 'Colors' dropdown has "Indigo" value
    When Select "opel" and "saab" in 'Cars' dropdown
    Then Check 'Cars' dropdown have "Saab, Opel" values
    When Select "//div[@id='withOptGroup']//div[contains(text(),'Group 2, option 1')]" in 'Groups' dropdown
    Then Check 'Groups' dropdown have "Group 2, option 1" value
    When Select "//div[@id='selectOne']//div[contains(text(),'Prof.')]" in 'Titles' dropdown
    Then Check 'Titles' dropdown have "Prof." value
    When Select "Green" and "Blue" in 'Multi Colors' dropdown
    Then Check 'Multi Colors' dropdown have "Green, Blue" values