@View_feature_test
Feature: Verify the feture of View Tab

  @Scroll_functionality_test
  Scenario: Verify the feature of Popuup Menu
    Given User is on Home Page
    When User clicks on View Tab
    And Scroll down the page
    Then User clicks on Popup Menu
    And Clicks on Make a Popup button
    Then Clicks on Search
