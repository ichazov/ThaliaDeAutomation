@CustomerLogin
Feature: Customer Login
  As a registered customer
  I want to be able to log into the website
  So that I can access my account and use the features

  Background:
    Given Customer is on the "Home" page

  Scenario: Successful login
    When Customer enters following credentials:
      | Email    | ugzbdi@mailsac.com |
      | Password | L8rFtlQ!           |
    And Customer clicks the Login button
    Then Customer should be successfully logged in

  Scenario: Invalid login credentials
    When Customer enters following credentials:
      | Email    | john.doe@example.com |
      | Password | incorrect-password   |
    And Customer clicks the Login button
    Then Customer should see the invalid credentials error message
    And Customer is not logged in

  Scenario: Forgotten password
    When Customer clicks Forgot password link
    Then Customer should be redirected to the "Forgot Password" page
    When Customer enters email address
    And Customer clicks Reset password button
    Then Customer should see Success message
#    And I receive password recovery email

#  Scenario: Account lockout
#    Given my account is locked due to multiple failed login attempts
#    When I try to log in with valid credentials
#    Then I should see the message "Account locked. Please contact support."
#    And I should not be able to log in