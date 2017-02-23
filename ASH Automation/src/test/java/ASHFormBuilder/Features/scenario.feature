Feature: Test Ash FormBuilder application
  #Background User should have formbuilder url

  @test
   Scenario: Verify the preview after adding project mastercontrol
    Given User should be logged in to formbuilder application
    When I drag and drop project control to tab1 of formbuilder
    And I edit controls in tab1 of formbuilder
    And I rename tab1 as Project
    And I Click on Save and go to Preview
    Then I verify in the Preview tab
    And Logout of the application
