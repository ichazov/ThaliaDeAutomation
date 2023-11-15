@GuestUserPurchase
Feature: Customer Purchase
  As a customer,
  I want to navigate through the online shopping experience,
  So that I can successfully purchase and receive the product.

  Background:
    Given Customer is on the "Home" page

  Scenario: Guest Customer Purchase
    When Customer searches for a desired product
    Then Customer should be redirected to "Search Results" page
    And Search results list contains products that correspond to the search term
    When Customer opens desired product's page
    Then Customer should be redirected to "Product Details" page
    When Customer adds product to the shopping cart
    And Product is successfully added to cart
    And Customer clicks Checkout button
    Then Customer should be redirected to "Login" page
    When Customer clicks Create Account button
    And Customer fills in the registration form
    And Customer clicks the Register button
    Then Customer should be redirected to "Billing Address" page
    When Customer fills in the Billing address form
      | Title | First Name | Last Name | Street         | House | Postal Code | City    |
      | Frau  | Jessica    | Wurfel    | Schanzenstraße | 33    | 20357       | Hamburg |
    And Customer clicks Submit button
    Then Customer should be redirected to "Order Review" page
    When Customer clicks Buy button
    Then Customer should be redirected to "PayPal" page

#  Scenario: Registered Customer Purchase



