Feature: Add Customer Details

  Scenario: 

  # Given user should be in homepage.
  #And user should click on Add customer.
  #When user enters all the fields  valid datas.
  #And user clicks on submit button.
  #Then user should get Customer Id displayed.
  Scenario: 

  #Given user should be in homepage.
  #And user should click on Add customer.
  #When user enters all the field valid datas.
  #| Rohit | Suresh | rohit@gmail.com | CDM | 7896578965 |
  #Then user should get Customer Id displayed.
  Scenario: 

  # Given user should be in homepage.
  #And user should click on Add customer.
  #When user enters all the field with  valid datas.
  # | Fstname | Rohit           |
  #| lstname | Suresh          |
  #| mail    | rohit@gmail.com |
  #| Add     | CDM             |
  #| phone   |      7896578965 |
  #And user clicks on submit button.
  #Then user should get Customer Id displayed.
  # Scenario:
  # Given user should be in homepage.
  #And user should click on Add customer.
  #When user enters all the field validated datas.
  # | Rohit | Suresh | rohit@gmail.com | CDM     | 7896578965 |
  #| Tejen | Suresh | tejen@gmail.com | Chennai | 9856798567 |
  #Then user should get Customer Id displayed.
  Scenario: 
    Given user should be in homepage.
    And user should click on Add customer.
    When user enters all the field with validated datas.
      | Fstname | lstname | Mail            | Add     | Phone      |
      | Rohit   | Suresh  | rohit@gmail.com | CDM     | 7896578965 |
      | Tejen   | Suresh  | tejen@gmail.com | Chennai | 9856798567 |
    Then user should get Customer Id displayed.
