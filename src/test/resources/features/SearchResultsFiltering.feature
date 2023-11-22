@SearchResultsFiltering
Feature: Search Results Filtering
  As a customer
  I want to be able to filter products in the store
  So that I can find the products I'm interested in more easily

  Background:
    Given Customer is on the "Home" page
    And Customer searches for a desired product
    Then Customer should be redirected to the "Search Results" page

  Scenario: Filtering products by category
    When Customer selects Audiobooks category
    Then Customer should see list of products of selected category

  Scenario: Filtering products by price range
    When Customer sets the price range from €5 to €10
    Then Customer should see list of products that fall within the €5 to €10 price range

  Scenario: Filtering products by category and price range
    When Customer selects the eBooks category
    And Customer sets the price range from €10 to €20
    Then Customer should see list of eBooks that fall within the €10 to €20 price range