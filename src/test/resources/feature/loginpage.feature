Feature: Adactin hotel booking

  Background: 
    Given User is on HomePage

  Scenario Outline: Adactin Hotel book a room
    When User enters the "<username>" ,"<password>" and enters booking page
    And User now in search hotel page
    And User is on select hotel page
    And User is on book ahotel page
    And user is on booking confirmation page

    Examples: 
      | username    | password   |
      | abineshm900 | Abinesh123 |

  @Regression
  Scenario Outline: Adactin book a rooms
    When User enters "<username>" ,"<password>" and enters the booking page
    And User in the search hotel page
    And User in theselect hotel page
    And User in the book ahotel page
    And user in the booking confirmation page

    Examples: 
      | username   | password   |
      | haiabinesh | Abinesh123 |

  Scenario Outline: Adactin book a rooms
    When User enters "<username>" ,"<password>"
    And User in search hotel page
    And User in select hotel page
    And User in book ahotel page
    And user in booking confirmation page

    Examples: 
      | username   | password   |
      | haiabinesh | Abinesh123 |
