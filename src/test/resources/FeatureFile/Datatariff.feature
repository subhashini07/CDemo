Feature: Choosing Tariff Plans

  Scenario: 

  # Given user should be in home page
  #And user should click tariff plans
  #When User chooses tariff plans
  #And User clicks on submit button
  #Then user should get displayed sucess message
  Scenario: 

  # Given user should be in home page
  #And user should click tariff plans
  #When User choose tariff plans
  # | 250 | 1500 | 125 | 500 | 75 | 85 | 25 |
  #And User clicks on submit button
  #Then user should get displayed sucess message
  Scenario: 

  # Given user should be in home page
  #And user should click tariff plans
  # When User choose tariffs plans.
  #|Rent|350|
  #|Mins|670|
  #| Inter    |  150 |
  # | SMS      |  250 |
  # | Local    |   90 |
  #| National |   45 |
  #|Charge|90|
  #And User clicks on submit button
  #Then user should get displayed sucess message
  Scenario: 

  # Given user should be in home page
  #And user should click tariff plans
  #When User choosed tariff planss
  # | 150 | 3500 | 425 | 300 | 65 | 50 | 32 |
  #| 275 | 2500 | 175 | 700 | 45 | 78 | 40 |
  #And User clicks on submit button
  #Then user should get displayed sucess message
  Scenario: 
    Given user should be in home page
    And user should click tariff plans
    When User chooses his tariff plans
      | Rental | Local | Inter | SMS | LocChar | InterChar | SMSChar |
      |    150 |  3500 |   425 | 300 |      65 |        50 |      32 |
      |    275 |  2500 |   175 | 700 |      45 |        78 |      40 |
    And User clicks on submit button
    Then user should get displayed sucess message
