Feature: Developer assigns to a task

  Scenario: Developer successfully assigns to a task
    Given Opens task1 screen
    When Assigns to task1
    And Clicks save button
    Then Sees message for successful assignment
    
  Scenario: Developer tries to assign to a taken task
    Given Opens task2 screen
    When Assigns to the task
    And Clicks save button
    Then Sees message for unsuccessful assignment