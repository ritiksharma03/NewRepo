@Animation_Test
Feature: Verify the features of Animation

  @default_Animation_Test
  Scenario: Verify the feature of Default Layout Animation
    Given App is launched
    When User click on Animation Tab
    And User click on Default Layout Animation
    Then Click on add button
    Then User can see a button

  @Hide_Show_Animaton_Test
  Scenario: Verify the feature of Hide and Show Animation
    Given App is launched
    When User click on Hide and Show Animation
    And Click on Hide and Click on button
    Then Click on Show button

  @Cloning_Test
  Scenario: Verify the feature of Cloning
    Given App is launched
    When User click on Cloning
    Then Click on Run button
