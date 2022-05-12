@register
Feature: Register


  @register_positif
  Scenario: user create account successfull
    Given user alredy in web Sport Arena
    And user alredy on register page
    When user input new account with required field only
    And user click button register
    Then user successful register
    And user direct to login page

  @register_negatif
  Scenario: user create account without fullname
    Given user alredy in web Sport Arena
    And user alredy on register page
    When user input new account without fullname required field only
    And user click button register
    Then user can see show popup alert message register failed

  @register_negatif_email
  Scenario: user create account with email without "@domain"
    Given user alredy in web Sport Arena
    And user alredy on register page
    When user input new account in email without domain required field only
    And user click button register
    Then user can see show alert message email tidak valid

  @register_negatif
  Scenario: user create account with registered email
    Given user alredy in web Sport Arena
    And user alredy on register page
    When user input registered account with required field only
    And user click button register
    Then user can see show popup alert message register failed