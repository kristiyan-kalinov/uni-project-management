Feature: Task status change

  Scenario: Valid task status change
  	Given Developer opens the screen of task1
    When Changes the status of the task from new to in progress
    And Enters a status change message
    And Clicks save button
    Then Sees successful change message
    
  Scenario: Finished task status change
  	Given Developer opens the screen of task2
    When Changes the status of the task from finished to in progress
    And Enters a status change message
    And Clicks save button
    Then Sees unsuccessful change message
    
  Scenario: No assignee task status change
  	Given Developer opens the screen of task3
    When Changes the status of the task from new to in progress with no assignee
    And Enters a status change message
    And Clicks save button
    Then Sees unsuccessful change message
    
	Scenario: No message task status change
		Given Developer opens the screen of task1
    When Changes the status of the task from new to in progress
    And Clicks save button
    Then Sees unsuccessful change message