@Excel_Test
Feature: Verify the features of OS 
 
@Messaging_Test
  Scenario Outline: Verify functionality of SMS Messaging
    Given User is On Home Page
    When User Clicks on OS Tab
    And Clicks on SMS messaging
    Then Fill the Recipient row <Row1> and Message row <Row2> details through excel "<SheetName>"
    Then User Clicks on Send button

    Examples: 
      | Row1 | Row2  | SheetName|
      | 0    | 1     | Sheet1   | 
      
