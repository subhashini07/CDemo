Feature: Choosing Tariff Plans

  Scenario Outline: 
    Given user should be in home page
    And user should click tariff plans
    When User chooses his tariff plans and enters data "<Rental>","<Local>","<Inter>","<SMS>","<LocChar>","<InterChar>","<SMSChar>"
    And User clicks on submit button
    Then user should get displayed sucess message

    Examples: 
      | Rental | Local | Inter | SMS | LocChar | InterChar | SMSChar |
      |    150 |  3500 |   425 | 300 |      65 |        50 |      32 |
      |    275 |  2500 |   175 | 700 |      45 |        78 |      40 |
      |    567 |  3456 |   213 | 150 |      25 |        50 |      10 |
      |    876 |  4562 |   345 | 100 |      15 |        70 |      20 |
