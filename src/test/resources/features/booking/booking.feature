@booking
Feature: Booking

  Scenario: User successfully booked arena with login account
    Given user already on Home page
    And user registered new account
    And user login account registered
    When user booked venue sport arena
#    And user create payment
    Then user successfully create booked venue