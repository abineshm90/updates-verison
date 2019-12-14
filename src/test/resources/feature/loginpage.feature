Feature: Facebook signup

  Scenario Outline: give data and sign up
    Given User is on Sign up page
    When User enters the "<firstName>" ,"<lastName>","<eMail>","<reEnter>"and "<password>"
    And User need to choose date and choose gender
    Then click sign up button

    Examples: 
      | firstName  | lastName    | eMail                 | reEnter               | password   |
      | selesriram | niumprasath | sele.hexa16@gmail.com | sele.hexa16@gmail.com | Sele12345! |
