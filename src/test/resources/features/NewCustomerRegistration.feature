@CustomerRegistration
Feature: Customer Registration
  As a new customer
  I want to be able to register on the website
  So that I can create a personalized account and access various features and services provided by the website

  Scenario: Successful user registration
    Given Customer is on the "Registration" page
    When Customer fills in the registration form
    And Customer clicks the Register button
    Then Customer should be redirected to "My Account" page
    And Customer Interests dialog is displayed