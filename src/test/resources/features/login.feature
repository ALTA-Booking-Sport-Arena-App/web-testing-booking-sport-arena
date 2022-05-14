@login
Feature: Login

  @user_login_positif
  Scenario: user login successfull
    Given user already in login page
    When user already fill email & password
    And user login button clicked
    Then user can see pop up Successfully logged in

  @admin_login_positif
  Scenario: admin login successfull
    Given admin already in login page
    When admin already fill email & password
    And admin login button clicked
    Then admin can see pop up Successfully logged in

  @login_negatif
  Scenario: user login unsuccessfull
    Given user already in login page
    When user already fill wrong email & password
    And user login button clicked
    Then user can see pop up message will appear indicated user not found

  @login_negatif
  Scenario: user login without password
    Given user already in login page
    When user already fill email
    And user login button clicked
    Then user can see pop up message will appear indicated password incorrect

  @login_negatif
  Scenario: user login without email
    Given user already in login page
    When user already fill password
    And user login button clicked
    Then user can see pop up message will appear indicated user not found