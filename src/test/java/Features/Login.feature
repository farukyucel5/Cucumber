Feature:Login feature

  Scenario: Login with correct username and password
    Given navigating to the login page
    And entering the username as "Faruk" and password as "12068036"
    And Clicking the login button
    Then you are supposed to see the user form page
